package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    private float x;
    private float y;
    private float speed;
    private int direction = 1;

    public Rectangle(float x, float y, float speed, int direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 50, 50);
    }

    public void update(GameContainer gamecontainer, int delta) {
        this.x += (float) delta / this.speed + direction;
        if (this.x > 600) {
            this.x = 0;
        }
        if (this.x < 0) {
            this.x = 600;
        }
    }

    private enum DIRECTION {RIGHT, LEFT, UP, DOWN}

}
