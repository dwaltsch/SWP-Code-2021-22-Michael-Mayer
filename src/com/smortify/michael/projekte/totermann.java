package com.smortify.michael.projekte;
import java.util.Random;
import java.util.Scanner;

public class totermann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] Wort = {'t','e','s','t'};
        char[] zen = {'*','*','*','*'};

        String fullW = "";
        boolean win = false;

        while (!win){
            char nt = scanner.next().charAt(0);

            for (int i = 0; i < Wort.length; i++) {
                if (Wort[i] == nt){
                    zen[i] = Wort[i];
                    System.out.println("Buchstabe gefunden");

                }

            }

            for (int bi = 0; bi < zen.length; bi++) {
                fullW = String.valueOf(zen[bi]);

            }
            System.out.println(fullW);

        }
    }
}
