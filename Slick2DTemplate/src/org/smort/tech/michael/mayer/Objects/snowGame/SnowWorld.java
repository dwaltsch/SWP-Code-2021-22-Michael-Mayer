package org.smort.tech.michael.mayer.Objects.snowGame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class SnowWorld extends BasicGame {
    private List<Actor> snowflakes;

    public SnowWorld(String title) {
        super(title);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SnowWorld("Test"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.snowflakes = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            this.snowflakes.add(new SnowFlake(SnowFlake.SIZE.BIG));
            this.snowflakes.add(new SnowFlake(SnowFlake.SIZE.MEDIUM));
            this.snowflakes.add(new SnowFlake(SnowFlake.SIZE.LARGE));
            this.snowflakes.add(new SnowFlake(SnowFlake.SIZE.SMALL));
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.snowflakes) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.snowflakes) {
            actor.render(graphics);
        }
    }

}
