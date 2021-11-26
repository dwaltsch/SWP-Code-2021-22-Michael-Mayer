package com.smortify.michael.projekte.schoolcheck.randomsentence;

import java.util.Random;
import java.util.Scanner;

public class Randomsentences {

    public static void main(String[] args) {
        boolean beenden = false;
        while (!beenden) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wieviele Sätze hättens gerne?");
            System.out.println("@Manuel bitte nichts anderes als eine Zahl eingeben");
            int anzahlsaetze = scanner.nextInt();

            Random random = new Random();

            // mir sind keine besseren Variablennamen eingefallen
            String[] erodersie = {"Er " , "Sie "};
            String[] wastunsie = {"geht " , "läuft ", "rennt " , "fährt "};
            String[] wohingehense = {"nach Hause.","zur Schule","ins Büro","zur Party"};

            for (int i = 0; i < anzahlsaetze; i++) {
                int erodersieauswahl = random.nextInt(2);
                int randomwassetun = random.nextInt(4);
                System.out.println(erodersie[erodersieauswahl]+wastunsie[randomwassetun]+wohingehense[randomwassetun]);
            }
            System.out.println("Wollens nochmal");
            System.out.println("1 Ja 2 Nein");
            int  nochmal = scanner.nextInt();
            if(nochmal == 2){
                beenden = true;
                System.out.println("tschö");
            }
        }

        }

    }

