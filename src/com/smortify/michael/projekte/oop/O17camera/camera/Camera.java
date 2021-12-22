package com.smortify.michael.projekte.oop.O17camera.camera;

import com.smortify.michael.projekte.oop.O17camera.camera.cameralense.CameraLense;
import com.smortify.michael.projekte.oop.O17camera.camera.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.SDCard;
import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile;
import com.smortify.michael.projekte.oop.O17camera.camera.settings.CameraSettings;

import java.util.List;

public class Camera {
    private int maxresolution;
    private int weight;
    private String colour;
    private Manufacturer manufacturer;
    private CameraLense cameraLense;
    private CameraSettings cameraSettings;
    private SDCard sdCard;
    private int filenumber;

    public Camera(int maxresolution, int weight, String colour, Manufacturer manufacturer, CameraLense cameraLense, CameraSettings cameraSettings, SDCard sdCard) {
        this.maxresolution = maxresolution;
        this.weight = weight;
        this.colour = colour;
        this.manufacturer = manufacturer;
        this.cameraLense = cameraLense;
        this.cameraSettings = cameraSettings;
        this.sdCard = sdCard;
    }

    public com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile takePicture() {
        com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile file = new com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile("png", 50, "foto" + filenumber);
        filenumber++;
        System.out.println("Foto gemacht");
        System.out.println(sdCard.getStorageSpace());
        return file;
    }

    public void showallFiles() {
        List<CameraFile> files = this.sdCard.getFiles();
        for (CameraFile file : files) {
            System.out.println(file.getName());
        }
    }

}
