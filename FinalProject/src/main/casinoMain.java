package main;

import java.util.Scanner;

import games.BlackJack;
import games.Slots;
import games.roulette;

public class casinoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int gameChoice = 0;
		int quit = 0;
		System.out.println("                                          Welcome to the                                                         ");
		System.out.println("                                                                                                                 ");
		System.out.println("                                                                                                                 ");
		System.out.println("   0000000000000000   0000000000000000    000000000000000   0000000000000000   00000000   00000   000000000000000");
		System.out.println("   0000000000000000   0000000000000000   0000000000000000   0000000000000000   00000000   00000   000000000000000");
		System.out.println("   000                000          000   000000000000            000000        0000000000 00000   000         000");
		System.out.println("   000                0000000000000000    00000000000000         000000        0000000000000000   000         000");
		System.out.println("   000                0000000000000000       000000000000        000000        00000  000000000   000         000");
		System.out.println("   0000000000000000   000          000   0000000000000000   0000000000000000   00000   00000000   000000000000000");
		System.out.println("   0000000000000000   000          000   000000000000000    0000000000000000   00000    0000000   000000000000000");
		Wallet.money();
		
	
		do {
		System.out.println("\nPlease choose a game : (1) Blackjack (2) Roulette (3) Slot Machine");
		gameChoice = input.nextInt();
		if(gameChoice == 1) {
		BlackJack.blackJackGame();
		}
//		else if(gameChoice == 2) {
	     roulette.roulette();
//		}
//		else if(gameChoice == 3) {
		Slots.randomGen();
//		}
//		else
//			System.out.println("Could not identify a game.");
		System.out.println("\nWould you like to play again? (1 to quit, 2 to play again)");
		quit = input.nextInt();
	}while(gameChoice < 4 && gameChoice > 0 && quit != 1);
		
	}
}
