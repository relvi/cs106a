/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel class instructs Karel to repair a set of arches where
 * some of the stones (represented by beepers) are missing from the columns
 * supporting the arches.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
    public void run() {
        repairColumn();
        while (frontIsClear()) {
            moveToNextColumn();
            repairColumn();
        }
    }
    
    /**
     * Repairs a column.
     */
    private void repairColumn() {
        positionKarel();
        while (frontIsClear()) {
            replaceStone();
            move();
        }
        positionKarel();
    }
    
    /**
     * Positions Karel to be facing the required direction.
     */
    private void positionKarel() {        
        if (facingSouth()) {
            turnLeft();
        } else {
            
            // Turn right in order to check the following conditions.
            turnRight();
            
            // Karel is facing east on 1st Street. Reposition so that Karel is
            // facing north.
            if (frontIsBlocked()) {
                turnAround();
                
            // Karel is facing east. Continuously rotate right until his path is
            // clear.
            } else {
                while (frontIsBlocked()) {
                    turnRight();
                }
            }
        }
    }
    
    /**
     * Replaces a stone (beeper) if none is present.
     */
    private void replaceStone() {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }
    
    /**
     * Moves Karel to the next column due to be repaired.
     * Each column is exactly four units apart.
     */
    private void moveToNextColumn() {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }
}