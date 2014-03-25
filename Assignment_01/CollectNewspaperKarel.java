/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * The CollectNewspaperKarel class instructs Karel to walk to the door of its
 * house, pick up the newspaper (represented by a beeper) and then return to its
 * initial position in the upper left hand corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	public void run() {
		moveToNewspaper();
		pickUpNewspaper();
		returnToStartPoint();
	}
	
	/**
	 * Moves Karel to the newspaper.
	 * This method is only valid on worlds with the same dimensions and layout
	 * as the world shown in the diagram.
	 */
	private void moveToNewspaper() {
		moveToWall();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	/**
	 * Picks up the newspaper (beeper), if present.
	 * When pickUpNewspaper is called, Karel must be on the same square as the
	 * newspaper.
	 */
	private void pickUpNewspaper() {
		if (beepersPresent()) {
			pickBeeper();
		}
	}
	
	/**
	 * Moves Karel back to its starting position.
	 * This method is only valid on worlds with the same dimensions and layout
	 * as the world shown in the diagram.
	 */
	private void returnToStartPoint() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		moveToWall();
		turnAround();
	}
	
	/**
	 * Moves Karel until it is blocked by a wall.
	 */
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}
}