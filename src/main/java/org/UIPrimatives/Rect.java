package org.UIPrimatives;
import java.awt.*;


public class Rect extends Shape {
    private final int w; // width
    private final int h; // height

    public Rect(Point initPos, Color col, int width, int height){
        super(initPos,col);
        w = width;
        h = height;

    }
@Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }


}
