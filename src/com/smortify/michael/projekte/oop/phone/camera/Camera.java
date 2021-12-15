package com.smortify.michael.projekte.oop.phone.camera;

import com.smortify.michael.projekte.oop.phone.sdcard.phonefile.PhoneFile;

public class Camera {
    private int resolution;
    private String manufacturer;
    private int filenumber;

    public Camera(int resolution, String manufacturer) {
        this.resolution = resolution;
        this.manufacturer = manufacturer;
    }


    public PhoneFile makePicture(){
        System.out.println("Foto gemacht");
        PhoneFile file = new PhoneFile("png",50,"foto"+filenumber);
        filenumber++;
        return file;
    }


    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
