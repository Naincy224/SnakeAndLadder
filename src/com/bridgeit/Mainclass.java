package com.bridgeit;

public class Mainclass {

	public static void main(String[] args) {
		

		SnakeAndLadder snakeladder = new SnakeAndLadder();
		snakeladder.position();

		int diceRoll = snakeladder.diceRoll();
		System.out.println("Number after rolling dice is : " +diceRoll);

	}

}
