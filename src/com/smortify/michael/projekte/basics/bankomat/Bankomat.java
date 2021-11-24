package com.smortify.michael.projekte.basics.bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int kontostand = 0;
        int leberkäs = 2;
        boolean isoff = false;
        System.out.println("Willkommen am Bankomat was wollen se machen:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ausrauben");
        System.out.println("5. Beenden");

        while (!isoff) {
            Scanner scanner = new Scanner(System.in);
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Wie viel Geld möchtens einzahla?");
                int einb = scanner.nextInt();
                kontostand = kontostand + einb;
                System.out.println("Geld erfolgreich eingezahlt");
            }
            if (auswahl == 2) {
                System.out.println("Wie viel Geld möchtens abheben?");
                int einb = scanner.nextInt();
                System.out.println("Sind se sich wirklich sicher?");
                System.out.println("1. Nein");
                System.out.println("2. Nein aber Nein");
                int confirm = scanner.nextInt();
                if (confirm == 1) {
                    kontostand = kontostand - einb;
                    System.out.println("Do haste die Geld");
                }
                if (confirm == 2) {
                    System.out.println("Gute Entscheidung tschö");
                }
            }
            if (auswahl == 3) {
                System.out.println("Ihr Kontostand beträgt " + kontostand + " Dogecoin");
                if (kontostand < 100) {
                    System.out.println("Des ist ziemlich wenig Geld brauchste Hilfe?");
                } else if (kontostand == 150) {
                    System.out.println("Immerhin reichts für an Monat");
                }
            }
            if (auswahl == 4) {
                System.out.println("Des ist aber ned grad nett sind se sich do sicher?");
                System.out.println("1 Ja gib die Kohle her i hab a Puffn");
                System.out.println("2 Hab mi umentschiedas i gang an Leberkäs essa");
                int auswahhl = scanner.nextInt();
                if (auswahhl == 1) {
                    System.out.println("Bankraub ischt illegal ihr Konto wurde auf 0 gesetzt");
                    kontostand = 0;
                    isoff = true;
                }
                if (auswahhl == 2) {
                    System.out.println("Passt guat do hast die Geld");
                    kontostand = kontostand - leberkäs;
                }
            }
            if (auswahl == 5) {
                System.out.println("Tschö");
                isoff = true;
            }
        }
    }
}
