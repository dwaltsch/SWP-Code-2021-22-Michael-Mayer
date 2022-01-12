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
    private boolean isallowed;

    public Camera(int maxresolution, int weight, String colour, Manufacturer manufacturer, CameraLense cameraLense, CameraSettings cameraSettings, SDCard sdCard) {
        this.maxresolution = maxresolution;
        this.weight = weight;
        this.colour = colour;
        this.manufacturer = manufacturer;
        this.cameraLense = cameraLense;
        this.cameraSettings = cameraSettings;
        this.sdCard = sdCard;
    }

    public boolean isIsallowed() {
        return isallowed;
    }

    public void setIsallowed(boolean isallowed) {
        this.isallowed = isallowed;
    }

    public com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile takePicture() {
        com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile file = new com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile("png", 20, "foto" + filenumber,"12.01.2021");
        filenumber++;
        System.out.println("Foto gemacht");
        int storageSizenew = 0;

        if(this.cameraSettings.getType() == CameraSettings.size.small){
            storageSizenew = this.sdCard.getStorageSpace() - 2;
        }
        if(this.cameraSettings.getType() == CameraSettings.size.medium){
            storageSizenew = this.sdCard.getStorageSpace() - 4;
        }
        if(this.cameraSettings.getType() == CameraSettings.size.large){
            storageSizenew = this.sdCard.getStorageSpace() - 6;
        }
        sdCard.setStorageSpace(storageSizenew);
        if(this.sdCard.getStorageSpace() < 0){
            System.out.println("kein Speicher mehr verfügbar bitte neue Karte einsetzen");

        }
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
