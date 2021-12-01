package com.smortify.michael.projekte.schoolcheck.randomsentence;

import java.util.Random;
import java.util.Scanner;

public class Randomsentences {

    public static void main(String[] args) {
        boolean playagain = false;
        while (!playagain) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wieviele Sätze hättens gerne?");
            System.out.println("@Manuel bitte nichts anderes als eine Zahl eingeben");
            int anzahlsaetze = scanner.nextInt();

            Random random = new Random();

            // mir sind keine besseren Variablennamen eingefallen
            String[] heOrSheString = {"Er " , "Sie "};
            String[] whatDoTheyDo = {"geht " , "läuft ", "rennt " , "fährt "};
            String[] whereDoTheyGo = {"nach Hause.","zur Schule","ins Büro","zur Party"};

            for (int i = 0; i < anzahlsaetze; i++) {
                int heOrShe = random.nextInt(2);
                int whatDoThey = random.nextInt(4);
                System.out.println(heOrSheString[heOrShe]+whatDoTheyDo[whatDoThey]+whereDoTheyGo[whatDoThey]);
            }
            System.out.println("Wollens nochmal");
            System.out.println("1 Ja 2 Nein");
            int  nochmal = scanner.nextInt();
            if(nochmal == 2){
                playagain = true;
                System.out.println("tschö");
                scanner.close();
            }
        }

        }

    }

