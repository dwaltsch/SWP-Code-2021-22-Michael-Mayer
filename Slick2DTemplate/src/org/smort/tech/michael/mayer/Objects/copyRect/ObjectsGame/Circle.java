package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.Graphics;

public class Circle {
    private enum DIRECTION{RIGHT,LEFT,UP,DOWN}
    private float x;
    private float y;
    private float speed;

    public Circle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y,50,50);
    }
    public void update(int delta){
        this.x += (float)delta/this.speed;
        if(this.x>600){
            this.x = 0;
        }
    }
}
