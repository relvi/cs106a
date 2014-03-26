/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * The CheckerboardKarel class instructs Karel to create a checkerboard of
 * beepers inside an empty rectangular world, as illustrated in the diagram.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
    public void run() {
        populateRowTypeAWithBeepers();
        turnLeft();
        while (frontIsClear()) {
            repositionKarel();
            populateRowTypeBWithBeepers();
            turnLeft();
            if (frontIsClear()) {
                repositionKarel();
                populateRowTypeAWithBeepers();
                turnLeft();
            }
        }
    }
    
    /**
     * Row Type A.
     * Makes a pattern of BEEPER SPACE BEEPER SPACE etc..
     */
    private void populateRowTypeAWithBeepers() {
        putBeeper();
        while (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
        }
    }
    
    /**
     * Row Type B.
     * Makes a pattern of SPACE BEEPER SPACE BEEPER etc..
     */
    private void populateRowTypeBWithBeepers() {
        if (frontIsClear()) {
            move();
            putBeeper();
            while (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                    putBeeper();
                }
            }
        }
    }
    
    /**
     * Repositions Karel so that it is in the correct position to populate the
     * next row with beepers.
     * Upon method call, Karel is facing north on the rightmost square of the
     * row.
     * Upon exiting the method, Karel is facing east on the leftmost square of
     * the row above.
     */
    private void repositionKarel() {
        turnLeft();
        returnToStartOfRow();
        moveToAboveRow();
    }
    
    /**
     * Returns Karel to the leftmost square in the row.
     */
    private void returnToStartOfRow() {
        while (frontIsClear()) {
            move();
        }
        turnAround();
    }
    
    /**
     * Moves Karel to the above row.
     */
    private void moveToAboveRow() {
        turnLeft();
        move();
        turnRight();
    }
}