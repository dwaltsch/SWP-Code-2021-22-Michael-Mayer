package com.smortify.michael.projekte.oop.O20musicbox;

import com.smortify.michael.projekte.oop.O20musicbox.magazin.Magazin;
import com.smortify.michael.projekte.oop.O20musicbox.magazin.record.Record;
import com.smortify.michael.projekte.oop.O20musicbox.magazin.record.title.Title;

import java.util.Scanner;

public class MusicBox {
    private Magazin magazin;
    private Scanner scanner;

    public MusicBox() {
        this.magazin = new Magazin();
        this.scanner = new Scanner(System.in);
        fillBox();
        run();
    }

    public void fillBox() {
        Record r1 = new Record("Dreamland"); // Neues Album
        r1.addTitel(new Title(250, "Heatwaves")); //Neuer Titel dem Album hinzufügen
        r1.addTitel(new Title(300, "Tangerine"));
        magazin.addRecord(r1);// Album dem Plattendings übergeben
        // und jetzt nochmal

        Record r2 = new Record("Exotica"); // Neues Album
        r2.addTitel(new Title(170, "Fireworks")); //Neuer Titel dem Album hinzufügen
        r2.addTitel(new Title(190, "Hypnotized"));
        r2.addTitel(new Title(190, "Dopamine"));
        magazin.addRecord(r2);
    }

    public void run() {
        while (true) {
            System.out.println("1. Zeige alle Platten");
            System.out.println("2 Wähle eine Platte aus");
            System.out.println("3. Spiele ab");
            int selection = this.scanner.nextInt();
            switch (selection) {
                case 1:
                    for (Record record : magazin.getRecords()) {
                        System.out.println(record.getName());
                    }
                default:
                    break;
                case 2:
                    System.out.println("Gib die Record Number ein");
                    int numberOfRecord = this.scanner.nextInt();
                    magazin.loadRecord(magazin.getRecords().get(numberOfRecord));
                case 3:
                    System.out.println("Welchen Titel möchtest du abspielen?");
                    int titelnumber = this.scanner.nextInt();
                    magazin.play(titelnumber);
            }
        }
    }
}
