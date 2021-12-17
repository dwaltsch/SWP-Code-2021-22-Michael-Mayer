package com.smortify.michael.projekte.oop.phone.sdcard;

import com.smortify.michael.projekte.oop.phone.Phone;
import com.smortify.michael.projekte.oop.phone.sdcard.phonefile.PhoneFile;

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


    public void save(PhoneFile file){

        files.add(file);
    }

    public SDCard(int storageSpace) {

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
