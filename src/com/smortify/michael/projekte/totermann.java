package com.smortify.michael.projekte;
import java.util.Random;
import java.util.Scanner;

public class totermann {
    public static void main(String[] args) {
        String dings = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wenn du das Wort ned ussafindest stribt ein Mann");
        System.out.println("Hier dein Wort");
        String[] worter = null;
        String[] an = null;
        an = new String[3];
        worter = new String[3];
        worter[0] = "test";
        worter[1] = "testaberlang";
        for (int i = 0; i < worter[0].length(); i++) {
            dings = dings + "*";
        }
        an[0] = dings;
        Random random = new Random();
        int auswahl = random.nextInt(1);

        System.out.println(worter[auswahl]);
        System.out.println(an[0]);

        String auswal = scanner.nextLine();

        for (int bi = 0; bi < an.length; bi++) {
            if (auswal == worter[bi]){
                System.out.println("War drinnen");
                System.out.println(bi);
                String ja = an[0];
                char[] jars = ja.toCharArray();
                jars[bi] = worter[0].charAt(0);
                an[0] = jars.toString();
                System.out.println(an[0]);
            }
            else {
                System.out.println("no");
            }
        }

    }
}
