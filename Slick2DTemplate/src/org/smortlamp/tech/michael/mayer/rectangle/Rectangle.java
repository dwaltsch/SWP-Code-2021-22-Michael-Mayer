package org.smortlamp.tech.michael.mayer.rectangle;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
    private int x;
    private int y;

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
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x++;
        if (this.x > 800) {
            this.x = 0;
        }
        this.y++;
        if (this.y > 800) {
            this.y = 0;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(x, y, 100, 100);
        graphics.drawString("Grüzi", 69, 69);
    }
}
