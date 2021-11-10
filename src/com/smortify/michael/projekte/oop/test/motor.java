package com.smortify.michael.projekte.oop.test;

public class motor {
    private enum TYPE{DIESEL,BENZIN}
    private int ps;
    private String type;

    public void fahren(int anzahl){
        System.out.println("Da motor läuft mit");
    }
}
