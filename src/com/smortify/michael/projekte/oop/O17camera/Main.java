package com.smortify.michael.projekte.oop.O17camera;

import com.smortify.michael.projekte.oop.O17camera.camera.Camera;
import com.smortify.michael.projekte.oop.O17camera.camera.manufacturer.Manufacturer;

public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("Kanohn","Taiwan PRC");
        Camera camera = new Camera(50,50,"schlammgrün",manufacturer);
        camera.takePicture();
    }
}
