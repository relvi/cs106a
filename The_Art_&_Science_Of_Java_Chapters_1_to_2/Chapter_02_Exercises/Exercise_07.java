/*
 * File: Exercise_07.java
 * ----------------------
 * This program draws the five interlocking rings (blue, yellow, black, green
 * and red) that form the symbol of the Olympic Games.
 * The canvas size I am working with is w: 753px h: 491px.
 */

package Chapter_02_Exercises;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Exercise_07 extends GraphicsProgram {
    public void run() {
        
        // ring 1
        GOval ring1 = new GOval(50, 50, 100, 100);
        ring1.setFilled(false);
        ring1.setColor(Color.BLUE);
        
        // ring 2
        GOval ring2 = new GOval(170, 50, 100, 100);
        ring2.setFilled(false);
        ring2.setColor(Color.YELLOW);
        
        // ring 3
        GOval ring3 = new GOval(290, 50, 100, 100);
        ring3.setFilled(false);
        ring3.setColor(Color.BLACK);
        
        // ring 4
        GOval ring4 = new GOval(110, 110, 100, 100);
        ring4.setFilled(false);
        ring4.setColor(Color.GREEN);
        
        // ring 5
        GOval ring5 = new GOval(230, 110, 100, 100);
        ring5.setFilled(false);
        ring5.setColor(Color.RED);
        
        add(ring1);
        add(ring2);
        add(ring3);
        add(ring4);
        add(ring5);
    }
}