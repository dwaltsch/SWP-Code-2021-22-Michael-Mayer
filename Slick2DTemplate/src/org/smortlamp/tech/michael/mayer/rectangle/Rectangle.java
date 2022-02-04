package org.smortlamp.tech.michael.mayer.rectangle;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
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
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    }
}
