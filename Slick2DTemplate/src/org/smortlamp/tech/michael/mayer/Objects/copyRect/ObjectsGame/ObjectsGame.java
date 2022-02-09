package org.smortlamp.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Rectangle> rectangles;

    private Rectangle rectangle2;

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
        this.rectangles = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(400),random.nextInt(40));
            rectangles.add(rectangle);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangle:this.rectangles){
            rectangle.update(delta);
        }

    }
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle:this.rectangles){
            rectangle.render(graphics);
        }
    }
}
