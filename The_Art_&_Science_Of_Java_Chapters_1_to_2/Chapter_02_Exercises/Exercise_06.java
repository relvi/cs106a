/*
 * File: Exercise_06.java
 * ----------------------
 * This program draws a picture of an archery target, which also happens to be
 * the logo of a large discount chain.
 * Both the outer and inner circles should be colored red. The middle circle
 * should be white.
 * The canvas size I am working with is w: 753px h: 491px.
 */

package Chapter_02_Exercises;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Exercise_06 extends GraphicsProgram {
    public void run() {
        
        // outer circle
        GOval outerCircle = new GOval(225, 95, 300, 300);
        outerCircle.setFilled(true);
        outerCircle.setColor(Color.RED);
        
        // middle circle
        GOval middleCircle = new GOval(275, 145, 200, 200);
        middleCircle.setFilled(true);
        middleCircle.setColor(Color.WHITE);
        
        // inner circle
        GOval innerCircle = new GOval(325, 195, 100, 100);
        innerCircle.setFilled(true);
        innerCircle.setColor(Color.RED);
        
        add(outerCircle);
        add(middleCircle);
        add(innerCircle);
    }
}