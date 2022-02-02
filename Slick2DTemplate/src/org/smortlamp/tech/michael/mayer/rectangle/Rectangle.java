package org.smortlamp.tech.michael.mayer.rectangle;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
    private float xRec;
    private float yRec;
    private float speed;
    private float xCirc;
    private float yCirc;
    private float xOv;
    private float yOv;
    int direction = 1;
    int direction2 = 1;
    int xdirection = 1;
    int ydirection = 0;
    boolean lastone = false;
    public Rectangle(String title) {
        super(title);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Test"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xCirc = 100;
        this.yCirc = 100;
        this.speed = 50;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        /*
               this.xCirc = this.xCirc + direction;
        this.yOv = this.yOv + direction2;
        if (this.xCirc > 600) {
            direction = -1;
        }
        if (this.xCirc < 100) {
            direction = 1;
        }
        this.yOv = this.yOv + direction;
        if (this.yOv > 600) {
            direction2 = -1;
        }
        if (this.yOv < 100) {
            direction2 = 1;
        }
         */
        this.xRec = this.xRec + xdirection;
        this.yRec = this.yRec + ydirection;
        if (this.xRec > 400) {
            xdirection = 0;
            ydirection = 1;
        }
        if (this.yRec >= 500) {
            ydirection = 0;
            xdirection = -1;
            lastone = true;
        }

        if (this.xRec < 300 && lastone == true) {
           xdirection = 0;
           ydirection = -1;
        }
        if (this.xRec < 100) {
            direction = 1;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRec, this.yRec, 100, 100);
        //graphics.drawOval(this.xOv,this.yOv,69,50);
        //graphics.drawOval(this.xCirc,this.yCirc,50,50);
        graphics.drawString("Grüzi", 69, 69);
    }
}
