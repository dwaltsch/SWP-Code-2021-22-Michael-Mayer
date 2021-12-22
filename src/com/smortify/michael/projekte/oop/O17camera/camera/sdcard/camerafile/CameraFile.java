package com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile;

public class CameraFile {
    private String extension;
    private int size;
    private String name;

    public CameraFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
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
