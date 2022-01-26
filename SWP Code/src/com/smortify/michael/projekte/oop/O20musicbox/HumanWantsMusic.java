package com.smortify.michael.projekte.oop.O20musicbox;

import com.smortify.michael.projekte.oop.O20musicbox.magazin.Magazin;

public class HumanWantsMusic {
    public static void main(String[] args) {

        Magazin magazin = new Magazin(); // Dings das die Platten hält;// Album dem Plattendings übergeben
        MusicBox mb = new MusicBox();
        mb.run();
        /*
        System.out.println(magazin.getSumOfMusicTime());
        List<Record> foundRecords = magazin.findRecord("Test");
        for (Record record : foundRecords){
            System.out.println(record.getName());
        }
        magazin.loadRecord(r1);
        magazin.play(0);

         */
    }
}
