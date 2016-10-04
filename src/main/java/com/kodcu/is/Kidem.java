package com.kodcu.is;


public class Kidem {

    private int calismaYili;
    private String iseGirisYili;
    private String istenCıkisYili;
    private double brutUcret;

    public Kidem(int calismaYili, String iseGirisYili, String istenCıkisYili, double brutUcret) {
        this.calismaYili = calismaYili;
        this.iseGirisYili = iseGirisYili;
        this.istenCıkisYili = istenCıkisYili;
        this.brutUcret = brutUcret;
    }

    public int getCalismaYili() {
        return calismaYili;
    }

    public void setCalismaYili(int calismaYili) {
        this.calismaYili = calismaYili;
    }

    public String getIseGirisYili() {
        return iseGirisYili;
    }

    public void setIseGirisYili(String iseGirisYili) {
        this.iseGirisYili = iseGirisYili;
    }

    public String getIstenCıkisYili() {
        return istenCıkisYili;
    }

    public void setIstenCıkisYili(String istenCıkisYili) {
        this.istenCıkisYili = istenCıkisYili;
    }

    public double getBrutUcret() {
        return brutUcret;
    }

    public void setBrutUcret(double brutUcret) {
        this.brutUcret = brutUcret;
    }







}
