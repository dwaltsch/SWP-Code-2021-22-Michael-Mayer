package com.smortify.michael.projekte.oop.O20musicbox.magazin;

import com.smortify.michael.projekte.oop.O20musicbox.magazin.record.Record;
import com.smortify.michael.projekte.oop.O20musicbox.magazin.record.title.Title;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    List<Record> records;
    private Record loadedRecord = null;

    public Magazin() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
    }

    public void removeRecord(Record record) {
        this.records.remove(record);
    }

    public int getSumOfMusicTime() {
        int sum = 0;
        for (Record record : records) {
            List<Title> titles = record.getTitles();
            for (Title title : titles) {
                sum += title.getLength();
            }
        }
        return sum;
    }

    public List<Record> findRecord(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().contains(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    public void play(int num) {
        if (this.loadedRecord == null) {
            System.out.println("Tut mir leid du hast da keine Platte geladen");
        } else {
            if (num >= this.loadedRecord.getTitles().size()) {
                System.out.println("Dieser Track existiert nicht");
            } else if (num < 0) {
                System.out.println("Dieser Track existiert nicht");
            }
            Title title = this.loadedRecord.getTitles().get(num);
            System.out.println("Playing: " + title.getName());
        }
    }

    public void loadRecord(Record record) {
        this.loadedRecord = record;
        System.out.println("loaded Record: " + record.getName());
    }

    public Record getLoadedRecord() {
        return loadedRecord;
    }

    public void setLoadedRecord(Record loadedRecord) {
        this.loadedRecord = loadedRecord;
    }

    public List<Record> getRecords() {
        return records;
    }
}
