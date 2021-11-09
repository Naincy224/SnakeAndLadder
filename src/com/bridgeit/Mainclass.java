package com.bridgeit;

public class Mainclass {

	public static void main(String[] args) {
		

		SnakeAndLadder snakeladder = new SnakeAndLadder();
		int position= snakeladder.getPosition();
		System.out.println("Position of the player : " +position);
		int diceRoll = snakeladder.diceRoll();
		System.out.println("Number after rolling dice is : " +diceRoll);
		int option = snakeladder.generateOption();
		System.out.println("Option is : " + option);
		snakeladder.switchPlayoption(option, diceRoll);

	}

}
