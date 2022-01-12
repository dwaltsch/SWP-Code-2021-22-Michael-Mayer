package com.smortify.michael.projekte.oop.O17camera.camera.sdcard;

import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int StorageSpace;
    private String manufacturer;
    private List<CameraFile> files;

    public SDCard(int storageSpace, String manufacturer) {
        this.StorageSpace = storageSpace;
        this.manufacturer = manufacturer;
        this.files = new ArrayList<>();
    }

    public SDCard(int storageSpace) {

    }

    public void save(CameraFile file) {
        files.add(file);
    }

    public int getStorageSpace() {
        return StorageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        StorageSpace = storageSpace;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<CameraFile> getFiles() {
        return files;
    }

    public void setFiles(List<CameraFile> files) {
        this.files = files;
    }
}
