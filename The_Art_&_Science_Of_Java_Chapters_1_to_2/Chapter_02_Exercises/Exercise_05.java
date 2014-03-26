/*
 * File: Exercise_05.java
 * ----------------------
 * This program draws a picture of a robot face.
 * The eyes are orange, the nose is black and the mouth is white. The face is
 * filled in gray but outlined in black.
 * The canvas size I am working with is w: 753px h: 491px.
 */

package Chapter_02_Exercises;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Exercise_05 extends GraphicsProgram {
    public void run() {
        
        // face
        GRect face = new GRect(275, 50, 200, 391);
        face.setFilled(true);
        face.setColor(Color.GRAY);
        
        // eyes
        GOval eye1 = new GOval(300, 75, 50, 50);
        eye1.setFilled(true);
        eye1.setColor(Color.ORANGE);
        GOval eye2 = new GOval(400, 75, 50, 50);
        eye2.setFilled(true);
        eye2.setColor(Color.ORANGE);
        
        // nose
        GRect nose = new GRect(360, 200, 30, 60);
        nose.setFilled(true);
        nose.setColor(Color.BLACK);
        
        // mouth
        GRect mouth = new GRect(300, 366, 150, 50);
        mouth.setFilled(true);
        mouth.setColor(Color.WHITE);
        
        add(face);
        add(eye1);
        add(eye2);
        add(nose);
        add(mouth);
    }
}