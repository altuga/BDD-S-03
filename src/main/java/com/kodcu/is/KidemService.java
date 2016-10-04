package com.kodcu.is;


public class KidemService {


    private int calismaSuresi;
    private String iseGirisYili;
    private String istenCıkisYili;
    private double brutUcretGirdi;

    private double brutUcret;
    private double damgaVergisi;
    private double netKidem;



    public void verileriAktar(String iseGirisYili, String istenCıkisYili, double brutUcret) {
        this.brutUcretGirdi= brutUcret;
        this.iseGirisYili = iseGirisYili;
        this.istenCıkisYili = istenCıkisYili;


    }


    public void setCalismaSuresi(int calismaSuresi) {
        this.calismaSuresi = calismaSuresi;
    }

    public void hesapla() {
        Kidem kidem = new Kidem(calismaSuresi, iseGirisYili, istenCıkisYili,brutUcret);

        this.brutUcret = this.brutUcretGirdi * this.calismaSuresi;
        this.damgaVergisi = (this.brutUcret  / 1000 ) + 0.80;
        this.netKidem =  this.brutUcret * 1.05 ;

    }

    public double getBrutUcret() {
        return brutUcret;
    }

    public double getDamgaVergisi() {
        return damgaVergisi;
    }

    public double getNetKidem() {
        return netKidem;
    }


}
