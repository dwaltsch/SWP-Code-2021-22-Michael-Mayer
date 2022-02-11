package org.smort.tech.michael.mayer.Objects.snowGame;

import org.newdawn.slick.*;
import org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame.ObjectsGame;

public class SnowWorld extends BasicGame {
    public SnowWorld(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Test"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
