package com.smortify.michael.projekte.oop.O20musicbox.magazin.record.title;

public class Title {
    private int length;
    private String name;

    public Title(int length, String name) {
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
