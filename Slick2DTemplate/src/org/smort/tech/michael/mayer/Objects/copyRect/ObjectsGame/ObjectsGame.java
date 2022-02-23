package org.smort.tech.michael.mayer.Objects.copyRect.ObjectsGame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;

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
        this.actors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(400), random.nextInt(40), -1);
            actors.add(rectangle);
        }
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            actors.add(circle);
        }
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            Elipse elipse = new Elipse(random.nextInt(800), random.nextInt(800), random.nextInt(5));
            actors.add(elipse);
        }
        Rocket rocket = new Rocket();
        this.actors.add(rocket);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }
}
