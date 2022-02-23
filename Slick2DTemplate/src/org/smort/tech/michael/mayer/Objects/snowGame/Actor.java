package org.smort.tech.michael.mayer.Objects.snowGame;

import org.newdawn.slick.Graphics;

public interface Actor {
    public void render(Graphics graphics);
    public void update(int delta);
}