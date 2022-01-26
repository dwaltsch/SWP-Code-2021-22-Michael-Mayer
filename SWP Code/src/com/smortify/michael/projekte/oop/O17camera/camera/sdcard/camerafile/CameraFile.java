package com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile;

public class CameraFile {
    private String extension;
    private int size;
    private String name;
    private String date;

    public CameraFile(String extension, int size, String name, String date) {
        this.extension = extension;
        this.size = size;
        this.name = name;
        this.date = date;
    }

    public void getInfo() {

    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

}
