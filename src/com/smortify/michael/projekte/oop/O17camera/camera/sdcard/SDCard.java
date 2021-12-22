package com.smortify.michael.projekte.oop.O17camera.camera.sdcard;

import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.phonefile.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int StorageSpace;
    private String manufacturer;
    private List<PhoneFile> files;

    public SDCard(int storageSpace, String manufacturer) {
        this.StorageSpace = storageSpace;
        this.manufacturer = manufacturer;
        this.files = new ArrayList<>();
    }


    public SDCard(int storageSpace) {

    }

    public void save(PhoneFile file) {

        files.add(file);
    }

    public int getStorageSpace() {
        return StorageSpace;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }
}
