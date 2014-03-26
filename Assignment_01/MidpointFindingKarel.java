/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * The MidpointFindingKarel class instructs Karel to position a beeper at the
 * midpoint of 1st Street.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
    public void run() {
        putBeepersOnCorners();
        moveBeepersTowardsCenter();
    }
    
    /**
     * Places beepers on the leftmost and rightmost corners of 1st Street.
     */
    private void putBeepersOnCorners() {
        putBeeper();
        moveToWall();
        putBeeper();
    }
    
    /**
     * Moves Karel until it is blocked by a wall.
     */
    private void moveToWall() {
        while (frontIsClear()) {
            move();
        }
    }
    
    /**
     * Moves one of the beepers towards the center then checks if the beepers
     * are at the midpoint. If not, eventually repeats the process with the 
     * other beeper.
     */
    private void moveBeepersTowardsCenter() {
        moveBeeper();
        checkIfBeepersAtMidpoint();
    }
    
    /**
     * Moves a beeper one square towards the center.
     */
    private void moveBeeper() {
        turnAround();
        pickBeeper();
        move();
        putBeeper();
    }
    
    /**
     * Checks if the beepers are at the midpoint.
     * If they are, one beeper is left and the program stops.
     * If not, the beeper that was picked up in order to make the check is put
     * back, and we move to the other beeper to repeat the process starting from
     * moveBeepersTowardsCenter.
     */
    private void checkIfBeepersAtMidpoint() {
        pickBeeper();
        if (noBeepersPresent()) {
            putBeeper();
            moveToOtherBeeper();
        }
    }
    
    /**
     * Moves Karel to the other beeper.
     * Then control returns to moveBeepersTowardsCenter to continue the process
     * of locating the midpoint.
     */
    private void moveToOtherBeeper() {
        move();
        while (noBeepersPresent()) {
            move();
        }
        moveBeepersTowardsCenter();
    }
}