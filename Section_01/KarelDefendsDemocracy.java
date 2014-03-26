/*
 * File: KarelDefendsDemocracy.java
 * --------------------------------
 * The KarelDefendsDemocracy class instructs Karel to clean the chad from a
 * ballot.
 */

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
    public void run() {
        while (frontIsClear()) {
            move();
            if (noBeepersPresent()) {
                removeChad();
            }
            move();
        }
    }
    
    /**
     * Removes any chad from the ballot rectangle.
     */
    private void removeChad() {
        turnLeft();
        checkRectangleCorner();
        checkRectangleCorner();
        turnRight();
    }
    
    /**
     * Removes any chad from the corner in front of Karel.
     */
    private void checkRectangleCorner() {
        move();
        while (beepersPresent()) {
            pickBeeper();
        }
        turnAround();
        move();
    }
}