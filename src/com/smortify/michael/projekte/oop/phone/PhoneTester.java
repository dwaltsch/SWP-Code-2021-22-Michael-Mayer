package com.smortify.michael.projekte.oop.phone;

import com.smortify.michael.projekte.oop.phone.camera.Camera;
import com.smortify.michael.projekte.oop.phone.sdcard.SDCard;
import com.smortify.michael.projekte.oop.phone.sim.Sim;

public class PhoneTester {
    public static void main(String[] args) {
        Sim sim = new Sim(1,"+43","67764508000");
        Camera camera = new Camera(50,"Laichak");
        SDCard sd = new SDCard(500,"Sahneplatte");

        Phone phone = new Phone("green",sim,camera,sd);

        phone.makeCall("06501122333", sim);
        phone.takePicture();

    }
}
