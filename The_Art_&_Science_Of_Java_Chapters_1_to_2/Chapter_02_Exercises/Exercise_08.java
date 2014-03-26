/*
 * File: Exercise_08.java
 * ----------------------
 * On most output devices, the Olympic Games logo from the preceeding exercise
 * doesn't show up that well because the yellow circle (and to a lesser extent,
 * the green one) tends to dissapear against the background of the window.
 * Make the borders of the rings three pixels wide.
 * The canvas size I am working with is w: 753px h: 491px.
 */

package Chapter_02_Exercises;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Exercise_08 extends GraphicsProgram {
    public void run() {
        
        // ring 1
        GOval ring1 = new GOval(50, 50, 100, 100);
        ring1.setFilled(true);
        ring1.setColor(Color.BLUE);
        GOval ring1Inner = new GOval(53, 53, 94, 94);
        ring1Inner.setFilled(true);
        ring1Inner.setColor(Color.WHITE);
        
        // ring 2
        GOval ring2 = new GOval(170, 50, 100, 100);
        ring2.setFilled(true);
        ring2.setColor(Color.YELLOW);
        GOval ring2Inner = new GOval(173, 53, 94, 94);
        ring2Inner.setFilled(true);
        ring2Inner.setColor(Color.WHITE);
        
        // ring 3
        GOval ring3 = new GOval(290, 50, 100, 100);
        ring3.setFilled(true);
        ring3.setColor(Color.BLACK);
        GOval ring3Inner = new GOval(293, 53, 94, 94);
        ring3Inner.setFilled(true);
        ring3Inner.setColor(Color.WHITE);
        
        // ring 4
        GOval ring4 = new GOval(110, 110, 100, 100);
        ring4.setFilled(true);
        ring4.setColor(Color.GREEN);
        GOval ring4Inner = new GOval(113, 113, 94, 94);
        ring4Inner.setFilled(true);
        ring4Inner.setColor(Color.WHITE);
        
        // ring 5
        GOval ring5 = new GOval(230, 110, 100, 100);
        ring5.setFilled(true);
        ring5.setColor(Color.RED);
        GOval ring5Inner = new GOval(233, 113, 94, 94);
        ring5Inner.setFilled(true);
        ring5Inner.setColor(Color.WHITE);
        
        add(ring1);
        add(ring1Inner);
        add(ring2);
        add(ring2Inner);
        add(ring3);
        add(ring3Inner);
        add(ring4);
        add(ring4Inner);
        add(ring5);
        add(ring5Inner);
    }
}