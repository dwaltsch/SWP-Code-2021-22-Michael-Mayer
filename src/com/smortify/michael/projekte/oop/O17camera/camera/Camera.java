package com.smortify.michael.projekte.oop.O17camera.camera;

import com.smortify.michael.projekte.oop.O17camera.camera.cameralense.CameraLense;
import com.smortify.michael.projekte.oop.O17camera.camera.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile;

public class Camera {
    private int maxresolution;
    private int weight;
    private String colour;
    private Manufacturer manufacturer;
    private CameraLense cameraLense;

    private int filenumber;

    public Camera(int maxresolution, int weight, String colour, Manufacturer manufacturer, CameraLense cameraLense) {
        this.maxresolution = maxresolution;
        this.weight = weight;
        this.colour = colour;
        this.manufacturer = manufacturer;
        this.cameraLense = cameraLense;
    }

    public CameraFile takePicture() {
        CameraFile file = new CameraFile("png", 50, "foto" + filenumber);
        filenumber++;
        System.out.println("Foto gemacht");
        return file;
    }

}
