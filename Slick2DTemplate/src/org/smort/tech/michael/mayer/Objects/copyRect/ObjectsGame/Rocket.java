package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Rocket implements Actor {
    private Image rocketImage;

    public Rocket() throws SlickException {
        this.rocketImage = new Image("testdata/Roget.png");
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(100, 100, 50, 500);
    }

    @Override
    public void update(int delta) {

    }
}
