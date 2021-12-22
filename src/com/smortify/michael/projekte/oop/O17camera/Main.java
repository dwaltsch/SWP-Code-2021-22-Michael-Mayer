package com.smortify.michael.projekte.oop.O17camera;

import com.smortify.michael.projekte.oop.O17camera.camera.Camera;
import com.smortify.michael.projekte.oop.O17camera.camera.cameralense.CameraLense;
import com.smortify.michael.projekte.oop.O17camera.camera.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.O17camera.camera.sdcard.SDCard;
import com.smortify.michael.projekte.oop.O17camera.camera.settings.CameraSettings;

public class Main {
    public static void main(String[] args) {
        SDCard sdCard = new SDCard(50, "Kioxika");
        CameraSettings cameraSettings = new CameraSettings(CameraSettings.size.small);
        Manufacturer manufacturer = new Manufacturer("Kanohn", "Taiwan PRC");
        CameraLense cameraLense = new CameraLense(500, "Niekon", 50);
        Camera camera = new Camera(50, 50, "schlammgrün", manufacturer, cameraLense, cameraSettings, sdCard);
        camera.takePicture();
        camera.showallFiles();
    }
}
