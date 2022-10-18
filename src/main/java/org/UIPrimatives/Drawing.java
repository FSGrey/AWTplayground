package org.UIPrimatives;
import java.awt.*;
import java.awt.event.*;


public class Drawing extends Canvas {
    private final Frame f;
    private final Point pC=new Point(200,200);
    private final Color cC=new Color(0x992266);
    private final int rad = 50;
    Circle C =new Circle(pC, cC, rad);


    // constructor
    public Drawing(){
        f = new Frame("le window");
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400);
    }

    public void paint(Graphics g){
        C.draw(g);
    };
}