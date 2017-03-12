
package com.kodcu.is;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.tr.Diyelimki;
import cucumber.api.java.tr.Eğerki;
import cucumber.api.java.tr.Ozaman;
import junit.framework.Assert;

import java.util.*;


public class KidemHesaplamaSteps {

    KidemService kidemService = new KidemService();

    @Diyelimki("^ihbar tazminatının hesaplanması için gerekli çalışan bilgileri$")
    public void ihbarTazminatınınHesaplanmasıIçinGerekliÇalışanBilgileri(DataTable dataTable) throws Throwable {

        String iseGirisTarihi="";
        String iseCikisTarihi="";
        String brutUcret="";

        for (Map<String, String> row : dataTable.asMaps(String.class, String.class)) {
            if (row.get("anahtarlar").equalsIgnoreCase("işten giriş tarihi")) {
                iseGirisTarihi  = row.get("bilgiler");
            }

            if (row.get("anahtarlar").equalsIgnoreCase("işten çıkış tarihi")) {
                iseCikisTarihi  = row.get("bilgiler");
            }

            if (row.get("anahtarlar").equalsIgnoreCase("brüt ücret")) {
                brutUcret  =   row.get("bilgiler") ;
            }


        }

        kidemService.verileriAktar(iseGirisTarihi, iseCikisTarihi,  Double.valueOf(brutUcret).doubleValue());


    }

    @Eğerki("^çalışma süresi (\\d+) seneden fazlaysa$")
    public void çalışmaSüresiSenedenFazlaysa(int calismaSuresi) throws Throwable {
        kidemService.setCalismaSuresi(calismaSuresi);

    }

    @Eğerki("^küsürat (\\d+) aydan az ise$")
    public void küsüratAydanAzIse(int arg1) throws Throwable {
        System.out.println(" küsüratAydanAzIse  " + arg1);
    }

    @Eğerki("^küsürat (\\d+) aydan fazla ise$")
    public void küsüratAydanFazlaIse(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" küsüratAydanFazlaIse  " + arg1);
    }

    @Ozaman("^çalışanın brüt ihbar, gelir vergisis, damga vergisi, net ihbar tutar bilgisi$")
    public void çalışanınBrütIhbarGelirVergisisDamgaVergisiNetIhbarTutarBilgisi(DataTable dataTable) throws Throwable {

        kidemService.hesapla();
        for (Map<String, String> row : dataTable.asMaps(String.class, String.class)) {

            if (row.get("anahtarlar").equalsIgnoreCase("brüt ücret")) {
                double brutUcret = kidemService.getBrutUcret();
                double gelenDeger = Double.valueOf(row.get("sonuçlar"));
                org.junit.Assert.assertEquals(brutUcret, gelenDeger,0);
            }

            if (row.get("anahtarlar").equalsIgnoreCase("damga vergisi")) {
                double damgaVergisi = kidemService.getDamgaVergisi();
                double gelenDeger = Double.valueOf(row.get("sonuçlar"));
                org.junit.Assert.assertEquals(damgaVergisi, gelenDeger,0);
            }

            if (row.get("anahtarlar").equalsIgnoreCase("net kıdem")) {
                double netKidem = kidemService.getNetKidem();
                double gelenDeger = Double.valueOf(row.get("sonuçlar"));
                org.junit.Assert.assertEquals(netKidem, gelenDeger,0);
            }


        }


    }


}