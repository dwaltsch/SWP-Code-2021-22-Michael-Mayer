package com.smortify.michael.projekte;
import java.util.Random;
import java.util.Scanner;

public class totermann {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);
        Random rendom = new Random();
        int r = rendom.nextInt(3);
        System.out.println();
        String[] Worter = {"test","abc","wort"};
        String auW = Worter[r];
        char[] Wort = new char[auW.length()];
        for (int i = 0; i < Wort.length; i++) {
            Wort[i] = auW.charAt(i);
        }

        char[] zen = new char[auW.length()];
        for (int i = 0; i < zen.length; i++) {
            zen[i] = '*';
        }
        String fullW = "";
        boolean win = false;

        while (!win){
            char nt = scammer.next().charAt(0);

            for (int i = 0; i < Wort.length; i++) {
                if (Wort[i] == nt){
                    zen[i] = Wort[i];
                    System.out.println("Buchstabe gefunden");
                }
            }


            for (int bi = 0; bi < zen.length; bi++) {
                fullW = fullW + String.valueOf(zen[bi]);
            }
            System.out.println(fullW);
            if (fullW.contains("*")){
            }
            else{
                System.out.println("Gratuliere sie haben gewonnen");
                win = true;
            }
            fullW = "";
        }
    }
}
