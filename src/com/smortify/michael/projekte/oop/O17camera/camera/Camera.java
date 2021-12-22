package com.smortify.michael.projekte.oop.O17camera.camera;

import com.smortify.michael.projekte.oop.O16phone.sdcard.phonefile.PhoneFile;
import com.smortify.michael.projekte.oop.O17camera.camera.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile;

public class Camera {
    private int maxresolution;
    private int weight;
    private String colour;
    private Manufacturer manufacturer;

    private int filenumber;

    public Camera(int maxresolution, int weight, String colour, Manufacturer manufacturer) {
        this.maxresolution = maxresolution;
        this.weight = weight;
        this.colour = colour;
        this.manufacturer = manufacturer;
    }

    public CameraFile takePicture() {
        CameraFile file = new CameraFile("png", 50, "foto" + filenumber);
        filenumber++;
        System.out.println("Foto gemacht");
        return file;
    }

}
