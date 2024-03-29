package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Cannonball implements Actor {
    private float x, y;

    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 10, 10);
    }

    @Override
    public void update(GameContainer gamecontainer, int delta) {
        this.y--;
    }
}
