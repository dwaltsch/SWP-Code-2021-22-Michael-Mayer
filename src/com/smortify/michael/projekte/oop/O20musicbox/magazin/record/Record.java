package com.smortify.michael.projekte.oop.O20musicbox.magazin.record;

import com.smortify.michael.projekte.oop.O20musicbox.magazin.record.title.Title;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<Title> titles;
    private String name;

    public Record(String name) {
        this.titles = new ArrayList<>();
        this.name = name;
    }

    public void addTitel(Title title) {
        this.titles.add(title);
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
