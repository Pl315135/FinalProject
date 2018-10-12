package main;

import java.util.Scanner;

import games.Slots;

public class casinoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int gameChoice = 0;
		System.out.println("                                          Welcome to the                                                          ");
		System.out.println("                                                                                                                  ");
		System.out.println("   0000000000000000   0000000000000000   0000000000000000   0000000000000000   00000000   00000   000000000000000  ");
		System.out.println("   0000000000000000   0000000000000000   0000000000000000   0000000000000000   00000000   00000   000000000000000 ");
		System.out.println("   000                000          000   000000000000            000000        0000000000 00000   000         000 ");
		System.out.println("   000                000          000    00000000000000         000000        0000000000000000   000    0    000");
		System.out.println("   000                0000000000000000        00000000000        000000        00000  000000000   000         000");
		System.out.println("   0000000000000000   0000000000000000   0000000000000000   0000000000000000   00000   00000000   000000000000000");
		System.out.println("   0000000000000000   000          000   0000000000000000   0000000000000000   00000    0000000   000000000000000");
		
		System.out.println("\n\nPlease choose a game : (1) Blackjack (2) Craps (3) Slot Machine");
		gameChoice = input.nextInt();
		
		Slots.randomGen();
	}

}
