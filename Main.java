/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author <rosasc293@gmail.com>
 * @version 1.0
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- ???
	2. Print deck (simple)
	- ???
	*
	*/
	public static void main(String[] args) {
		
		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array

		//2. Print deck

		//1. 
		Card[] deck = new Card[52];
		char[] suits = { Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE };
		int indexNum = 0;
		for (char suit : suits) {// advanced for loop
			for (int value = 1; value <= 13; value++) {
				deck[indexNum++] = new Card(value, suit);
				}
		}

		// 2.
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i] + " ");
			if ((i+1) % 13 == 0);
		}

		
	}
}