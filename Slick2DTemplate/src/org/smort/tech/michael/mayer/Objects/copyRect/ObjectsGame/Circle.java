package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle {
    private enum DIRECTION{RIGHT,LEFT,UP,DOWN}
    private float x;
    private float y;
    private float speed;
    private int diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(500);
        this.y = random.nextInt(400);
        this.speed = random.nextInt(40)+ 10;
        this.diameter = random.nextInt(50);
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x,this.y,this.diameter,this.diameter);
    }
    public void update(int delta){
        this.y += (float)delta/this.speed;
        if(this.y>600){
            this.y = 0;
        }
    }
}
