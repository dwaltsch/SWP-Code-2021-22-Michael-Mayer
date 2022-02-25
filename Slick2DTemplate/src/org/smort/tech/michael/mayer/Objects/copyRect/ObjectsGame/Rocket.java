package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.*;

public class Rocket implements Actor {
    private Image rocketImage;
    private float x,y;
    public Rocket() throws SlickException {
        this.rocketImage = new Image("testdata/Roget.png");
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x, this.y, 10, 50);
    }

    @Override
    public void update(GameContainer gamecontainer,int delta) {
        if(gamecontainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x++;
        }
        if(gamecontainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x--;
        }
        if(gamecontainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y++;
        }
        if(gamecontainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y--;
        }
    }

    public Image getRocketImage() {
        return rocketImage;
    }

    public void setRocketImage(Image rocketImage) {
        this.rocketImage = rocketImage;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
