package com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel;

public class Rearmirror {
    private int size;
    private int position;

    public Rearmirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
