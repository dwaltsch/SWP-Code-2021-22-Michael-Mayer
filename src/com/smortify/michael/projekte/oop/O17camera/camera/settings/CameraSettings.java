package com.smortify.michael.projekte.oop.O17camera.camera.settings;

public class CameraSettings {
    private size type;

    public CameraSettings(size type) {
        this.type = type;
    }

    public size getType() {
        return type;
    }

    public void setType(size type) {
        this.type = type;
    }

    public enum size {small, medium, large}

}
