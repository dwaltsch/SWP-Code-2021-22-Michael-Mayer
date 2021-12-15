package com.smortify.michael.projekte.oop.phone.sdcard.phonefile;

import com.smortify.michael.projekte.oop.phone.sdcard.SDCard;

public class PhoneFile extends SDCard {

    public PhoneFile(int storageSpace) {
        super(storageSpace);
    }
    private enum extension {MP3,MKV}
    private int size;
    private String name;


    public void getInfo(){

    }
}
