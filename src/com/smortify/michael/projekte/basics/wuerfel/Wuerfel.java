package com.smortify.michael.projekte.basics.wuerfel;

import java.util.Random;
import java.util.Scanner;

/*
Erstelle ein Würfelspiel! Du spielst gegen den Computer.
Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.s
Er spielt dabei gegen den Computer.
Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.
 */

public class Wuerfel {
    public static void main(String[] args) {
        // vars
        Random random = new Random();
        int result = 0;
        int result2 = 0;
        int computeradvantage = 5;
        System.out.println("Grüß Gott in Vorarlberg möchtens Geld beim Würfeln verlieren");
        System.out.println("1. Ja");
        System.out.println("2. I hab eh koa Wahl meinetwegen");
        Scanner scanner = new Scanner(System.in);
        int auswahl = scanner.nextInt();

        if (auswahl < 3) {
            for (int i = 1; i < 7; i++) {
                int r = random.nextInt(6) + 1;
                result = result + r;
                int b = random.nextInt(6 + computeradvantage) + 1;
                result2 = result2 + b;
                if (i == 6) {
                    System.out.println("Ihr Ergebniss ist: " + result);
                    System.out.println("Der Computer hat: " + result2);
                    if (result > result2) {
                        System.out.println("Gratuliere irgendwie haben sie gewonnen");
                    } else if (result < result2) {
                        System.out.println("Ez Computer hat gewonnen");
                    }
                }
            }
        }
    }
}

