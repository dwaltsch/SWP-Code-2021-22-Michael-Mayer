package com.smortify.michael.projekte.oop.phone;

import com.smortify.michael.projekte.oop.phone.camera.Camera;
import com.smortify.michael.projekte.oop.phone.sdcard.SDCard;
import com.smortify.michael.projekte.oop.phone.sim.Sim;

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
        camera.makePicture();
    }

    public void makeCall(String TelNr, Sim sim){
        this.sim.doCall(TelNr,sim);
    }

    public void getSpace(){

    }
    public void showallFiles(){
        this.sdCard.getallFiles();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
