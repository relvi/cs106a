/*
 * File: Exercise_02.java
 * ----------------------
 * This program multiplies two numbers and divides the product by two.
 */

package Chapter_02_Exercises;

import acm.program.*;

public class Exercise_02 extends ConsoleProgram {
    public void run() {
        println("This program multiplies two numbers and divides the product " +
        		"by two.");
        double n1 = readDouble("Enter n1: ");
        double n2 = readDouble("Enter n2: ");
        double result = (n1 * n2) / 2;
        println("result = " + result);
    }
}