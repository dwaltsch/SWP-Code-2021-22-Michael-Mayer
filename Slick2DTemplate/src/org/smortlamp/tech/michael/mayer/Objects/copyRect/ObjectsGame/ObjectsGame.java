package org.smortlamp.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {


    private Rectangle rectangle;

    public ObjectsGame(String title) {
        super(title);
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

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(0,0,1);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);

    }
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
    }
}
