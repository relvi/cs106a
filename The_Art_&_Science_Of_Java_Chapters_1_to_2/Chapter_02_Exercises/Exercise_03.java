/*
 * File: Exercise_03.java
 * ----------------------
 * This program extends the Add2Integers program shown in Figure 2-2 so that it
 * adds three integers instead.
 */

package Chapter_02_Exercises;

import acm.program.*;

public class Exercise_03 extends ConsoleProgram {
    public void run() {
        println("This program adds three integers.");
        int n1 = readInt("Enter n1: ");
        int n2 = readInt("Enter n2: ");
        int n3 = readInt("Enter n3: ");
        int total = n1 + n2 + n3;
        println("The total is " + total + ".");
    }
}
