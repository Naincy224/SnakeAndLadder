package com.bridgeit;

public class SnakeAndLadder {
	
	private static final int NOPLAY = 1;
	private static final int LADDER = 2;
	private static final int SNAKE = 3;
	

	// uc1
	private int position = 0;

	public int getPosition() {
		return position;

	}

//uc2
	public int diceRoll() {

		int diceRoll = (int) Math.floor((Math.random() * 10 % 6) + 1);
		return diceRoll;

	}

//uc3
	public void switchPlayoption(int option, int roll) {

		switch (option) {

		case NOPLAY:
			System.out.println("No play");
			break;
		case LADDER:
			position = roll + position;
			if (position > 100) {
				position = position - roll;
			}
			System.out.println("The current position of player :" + position);
			break;
		case SNAKE:

			position = position - roll;
			if (position < 0) {
				position = 0;
			}
			System.out.println("The current position of player :" + position);
			break;

		default:

			break;

		}

	}

	// uc3
	public int generateOption() {

		int generateOption = (int) Math.floor((Math.random() * 10 % 3) + 1);
		return generateOption;
	}

}
