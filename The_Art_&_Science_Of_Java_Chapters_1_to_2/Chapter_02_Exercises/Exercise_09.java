/*
 * File: Exercise_09.java
 * ----------------------
 * This program draws a picture of a rainbow.
 * Starting at the top, the six stripes in the rainbow are red, orange, yellow,
 * green, blue and magenta. The background is cyan.
 * The canvas size I am working with is w: 753px h: 491px.
 */

package Chapter_02_Exercises;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Exercise_09 extends GraphicsProgram {
    public void run() {
        
        // background
        GRect background = new GRect(0, 0, 753, 491);
        background.setFilled(true);
        background.setColor(Color.CYAN);
        
        // stripe 1
        // DEL: x, y, width, height
        GOval stripe1 = new GOval(-376.5, 20, 1506, 1506);
        stripe1.setFilled(true);
        stripe1.setColor(Color.RED);
        
        // stripe 2
        GOval stripe2 = new GOval(-376.5, 40, 1506, 1506);
        stripe2.setFilled(true);
        stripe2.setColor(Color.ORANGE);
        
        // stripe 3
        GOval stripe3 = new GOval(-376.5, 60, 1506, 1506);
        stripe3.setFilled(true);
        stripe3.setColor(Color.YELLOW);
        
        // stripe 4
        GOval stripe4 = new GOval(-376.5, 80, 1506, 1506);
        stripe4.setFilled(true);
        stripe4.setColor(Color.GREEN);
        
        // stripe 5
        GOval stripe5 = new GOval(-376.5, 100, 1506, 1506);
        stripe5.setFilled(true);
        stripe5.setColor(Color.BLUE);
        
        // stripe 6
        GOval stripe6 = new GOval(-376.5, 120, 1506, 1506);
        stripe6.setFilled(true);
        stripe6.setColor(Color.MAGENTA);
        
        // foreground
        GOval foreground = new GOval(-376.5, 140, 1506, 1506);
        foreground.setFilled(true);
        foreground.setColor(Color.CYAN);
        
        add(background);
        add(stripe1);
        add(stripe2);
        add(stripe3);
        add(stripe4);
        add(stripe5);
        add(stripe6);
        add(foreground);
    }
}