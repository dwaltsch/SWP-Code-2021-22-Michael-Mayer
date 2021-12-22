package com.smortify.michael.projekte.oop.O17camera.camera;

import com.smortify.michael.projekte.oop.O16phone.sdcard.phonefile.PhoneFile;
import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.camerafile.CameraFile;

public class Camera {
    private int maxresolution;
    private int weight;
    private String colour;
    private int filenumber;

    public CameraFile takePicture() {
        CameraFile file = new CameraFile("png", 50, "foto" + filenumber);
        filenumber++;
        System.out.println("Foto gemacht");
        return file;
    }

}
