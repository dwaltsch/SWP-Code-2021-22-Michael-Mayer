package com.smortify.michael.projekte.oop.phone;

import com.smortify.michael.projekte.oop.phone.camera.Camera;
import com.smortify.michael.projekte.oop.phone.sdcard.SDCard;
import com.smortify.michael.projekte.oop.phone.sdcard.phonefile.PhoneFile;
import com.smortify.michael.projekte.oop.phone.sim.Sim;

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

    public void takePicture(){
        PhoneFile file = camera.makePicture();
        this.sdCard.save(file);
    }

    public void makeCall(String TelNr, Sim sim){
        this.sim.doCall(TelNr,sim);
    }

    public void getSpace(){

    }
    public void showallFiles(){
        List<PhoneFile> files = this.sdCard.getFiles();
        for (PhoneFile file : files){
            System.out.println(file.getName());
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
