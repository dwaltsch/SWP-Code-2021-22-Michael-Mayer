package org.smortlamp.tech.michael.mayer.Objects.OOObjectsgame.ObjectsGame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private float x;

    ;
    private float y;
    private DIRECTION objectDirection;
    private float x1;
    private float y1;
    private DIRECTION object1Direction;
    private float x2;
    private float y2;
    private DIRECTION object2Direction;
    private float speed;

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
        this.x = 100;
        this.speed = 2.0f;
        this.objectDirection = DIRECTION.RIGHT;

        this.y1 = 50;
        this.object1Direction = DIRECTION.DOWN;

        this.x2 = 50;
        this.object2Direction = DIRECTION.RIGHT;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (this.object1Direction == DIRECTION.DOWN) {
            this.y1 += delta / this.speed;
            if (this.y1 > 500) {
                this.object1Direction = DIRECTION.UP;
            }
        } else {
            this.y1 -= delta / this.speed;
            if (this.y1 < 100) {
                this.object1Direction = DIRECTION.DOWN;
            }
        }
        if (this.objectDirection == DIRECTION.RIGHT) {
            this.x += delta / this.speed;
            if (this.x > 500) {
                this.objectDirection = DIRECTION.LEFT;
            }
        } else {
            this.x -= delta / this.speed;
            if (this.x < 100) {
                this.objectDirection = DIRECTION.RIGHT;
            }
        }
        if (this.object2Direction == DIRECTION.RIGHT) {
            this.x2 += delta / this.speed;
            if (this.x2 > 500) {
                this.object2Direction = DIRECTION.DOWN;
            }
        }
        if (this.object2Direction == DIRECTION.DOWN) {
            this.y2 += delta / this.speed;
            if (this.y2 > 500) {
                this.object2Direction = DIRECTION.LEFT;
            }
        } else if (this.object2Direction == DIRECTION.LEFT) {
            this.x2 -= delta / this.speed;
            if (this.x2 < 100) {
                this.object2Direction = DIRECTION.UP;
            }
        } else if (this.object2Direction == DIRECTION.UP) {
            this.y2 -= delta / this.speed;
            if (this.y2 < 100) {
                this.object2Direction = DIRECTION.RIGHT;
            }
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawOval(x1, y1, 50, 50);
        graphics.drawOval(x, y, 50, 50);
        graphics.drawRect(x2, y2, 50, 50);
    }

    private enum DIRECTION {RIGHT, DOWN, LEFT, UP}
}
