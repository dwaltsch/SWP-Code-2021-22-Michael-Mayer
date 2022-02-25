package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {
    private float x;
    private float y;
    private float speed;
    private float diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(500);
        this.y = random.nextInt(400);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(10);
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    public void update(GameContainer gamecontainer, int delta) {
        this.y += (float) delta / this.speed;
        this.diameter = this.diameter + 0.005f;
        if (this.y > 600) {
            this.y = 0;
        }
    }

    private enum DIRECTION {RIGHT, LEFT, UP, DOWN}
}
