package games;

import java.util.Scanner;

public class BlackJack {

public static void blackJackGame() {
	Scanner input = new Scanner(System.in);
	int drawCard = 0;
	int aces = 0;
	int points;
	int totalPoints = 0;
	String cardName = null;
	
	
	for (int count = 0; count < 2; count++) {
	drawCard = (int)(Math.random() * 13 + 1);
	switch (drawCard) {
	case 1:
		cardName = "Ace";
		aces = +1;
		points = 11;
		break;
	case 2:
		cardName = "Two";
		points = 2;
		break;
	case 3:
		cardName = "Three";
		points = 3;
		break;
	case 4: 
		cardName = "Four";
		points = 4;
		break;
	case 5:
		cardName = "Five";
		points = 5;
		break;
	case 6: 
		cardName = "Six";
		points = 6;
		break;
	case 7:
		cardName = "Seven";
		points = 7;
		break;
	case 8:
		cardName = "Eight";
		points = 8;
		break;
	case 9:
		cardName = "Nine";
		points = 9;
		break;
	case 10:
		cardName = "Ten";
		points = 10;
		break;
	case 11:
		cardName = "Jack";
		points = 10;
		break;
	case 12:
		cardName = "Queen";
		points = 10;
		break;
	case 13:
		cardName = "King";
		points = 10;
		break;
	default:
		points = 1000;
		break;
	}
	System.out.println(cardName + " " + points);
	}
	
	}
}




















