/*
 * File: Exercise_01.java
 * ----------------------
 * This program changes HelloProgram.java so that the message reads
 * "I love Java" instead of "hello, world". It also contains my name in the
 * "bottom right corner".
 */

package Chapter_02_Exercises;

import acm.graphics.*;
import acm.program.*;

public class Exercise_01 extends GraphicsProgram {
    public void run() {
        GLabel message = new GLabel("I love Java", 100, 75);
        add(message);
        GLabel name = new GLabel("relvi", 200, 150);
        add(name);
    }
}