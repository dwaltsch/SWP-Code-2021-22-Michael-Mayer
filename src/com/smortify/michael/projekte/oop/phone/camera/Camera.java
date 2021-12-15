package com.smortify.michael.projekte.oop.phone.camera;

public class Camera {
    private int resolution;
    private String manufacturer;

    public Camera(int resolution, String manufacturer) {
        this.resolution = resolution;
        this.manufacturer = manufacturer;
    }


    public void makePicture(){

    }


    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
