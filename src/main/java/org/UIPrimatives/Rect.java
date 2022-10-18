package org.UIPrimatives;
import java.awt.*;


public class Rect {
    private final int w; // width
    private final int h; // height
    private final Point pos; // position
    private final Color col; // fill colour

    public Rect(Point initPos, Color col, int width, int height){
        w = width;
        h = height;
        pos = initPos;
        this.col = col;

    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }


}
