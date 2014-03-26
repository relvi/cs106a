/*
 * File: Exercise_04.java
 * ----------------------
 * This program generates a simple picture of a house with a peaked roof, two
 * windows and a door with a circular doorknob.
 * The canvas size I am working with is w: 753px h: 491px.
 */

package Chapter_02_Exercises;

import acm.program.*;
import acm.graphics.*;

public class Exercise_04 extends GraphicsProgram {
    public void run() {
        
        // roof
        GLine leftRoofPeak = new GLine(100, 150, 375, 50);
        GLine rightRoofPeak = new GLine(375, 50, 650, 150);
        
        // house
        GRect house = new GRect(100, 150, 550, 241);
        
        // windows
        GRect window1 = new GRect(120, 170, 100, 100);
        GRect window2 = new GRect(530, 170, 100, 100);
        
        // door
        GRect door = new GRect(300, 191, 150, 200);
        GOval doorHandle = new GOval(410, 291, 20, 20);
        
        add(leftRoofPeak);
        add(rightRoofPeak);
        add(house);
        add(window1);
        add(window2);
        add(door);
        add(doorHandle);
    }
}