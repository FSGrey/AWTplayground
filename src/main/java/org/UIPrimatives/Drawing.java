package org.UIPrimatives;
import java.awt.*;
import java.awt.event.*;


public class Drawing extends Canvas {
    private final Frame f;
    private final Point pC1=new Point(200,200);
    private final Color cC1=new Color(0x992266);
    private final int rad = 50;

    private final Point pR1=new Point(100,100);
    private final Color cR1=new Color(0x349922);
    private final int wR1=50;
    private final int hR1=100;
    Circle C =new Circle(pC1, cC1, rad);
    Rect R =new Rect(pR1,cR1,wR1,hR1);


    // constructor
    public Drawing(){
        f = setupFrame();
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setupCanvas();
    }

    private Frame setupFrame() {
        final Frame f;
        f = new Frame("le window");
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        return f;
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400);
    }

    public void paint(Graphics g){
        C.draw(g);
        R.draw(g);
    }
}