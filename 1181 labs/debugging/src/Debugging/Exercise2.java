package Debugging;

import java.util.Random;

public class Exercise2 {
//missing break statements
	public static void main(String[] args) {
		final int KING = 0, QUEEN = 1, JACK = 2, ACE = 3;

		Random generator = new Random();
		int numOfCards = generator.nextInt(5) + 1;
		System.out.println("You drew " + numOfCards + " cards from the deck:");

		for (int i = 0; i < numOfCards; i++) {
			switch (generator.nextInt(4)) {
			case KING:
				System.out.println(i+1+"You drew a King.");
				break;
			case QUEEN:
				System.out.println(i+1+"You drew a Queen.");
				break;
			case JACK:
				System.out.println(i+1+"You drew a Jack.");
				break;
			case ACE:
				System.out.println(i+1+"You drew an Ace.");
				break;
			}
		}
	}

}
