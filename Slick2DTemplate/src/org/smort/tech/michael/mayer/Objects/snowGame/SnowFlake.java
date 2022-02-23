package org.smort.tech.michael.mayer.Objects.snowGame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class SnowFlake implements Actor {
    private float x, y;

    ;
    private int size;
    private int speed;
    private Random random;
    public SnowFlake(SIZE size) {
        this.random = new Random();
        if (size == size.BIG) {
            this.size = 12;
            this.speed = 2;
        }
        if (size == size.MEDIUM) {
            this.size = 8;
            this.speed = 3;
        }
        if (size == size.LARGE) {
            this.size = 15;
            this.speed = 1;
        }
        if (size == size.SMALL) {
            this.size = 4;
            this.speed = 10;
        }
    }

    public void setRandomPosition() {
        this.x = this.random.nextInt(800);
        this.y = this.random.nextInt(600) - 600;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, this.size, this.size);
    }

    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            setRandomPosition();
        }
    }

    public enum SIZE {BIG, SMALL, MEDIUM, LARGE}
}
