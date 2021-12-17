package com.smortify.michael.projekte.oop.O16phone;

import com.smortify.michael.projekte.oop.O16phone.camera.Camera;
import com.smortify.michael.projekte.oop.O16phone.sdcard.SDCard;
import com.smortify.michael.projekte.oop.O16phone.sdcard.phonefile.PhoneFile;
import com.smortify.michael.projekte.oop.O16phone.sim.Sim;

import java.util.List;

public class Phone {
    private String color;
    private Sim sim;
    private Camera camera;
    private SDCard sdCard;

    public Phone(String color, Sim sim, Camera camera, SDCard sdCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
    }

    public void takePicture() {
        PhoneFile file = camera.makePicture();
        this.sdCard.save(file);
    }

    public void makeCall(String TelNr, Sim sim) {
        this.sim.doCall(TelNr, sim);
    }

    public void getSpace() {

    }

    public void showallFiles() {
        List<PhoneFile> files = this.sdCard.getFiles();
        for (PhoneFile file : files) {
            System.out.println(file.getName());
        }
    }

    public void getfreeSpace() {
        int size = 0;
        List<PhoneFile> files = this.sdCard.getFiles();
        for (PhoneFile file : files) {
            size += file.getSize();
        }
        System.out.println("You used " + size + " MB there are  " + (sdCard.getStorageSpace() - size) + " MB remaining on disk");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
