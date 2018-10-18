package main;

import games.Slots;

public class Wallet {
	
	private static int money = 100;	
	
	public static void money() {
	
		System.out.println("\nYou have " + money + " dollars.");

	}
		
			
		public static int moneyAmount(int bet, int winnings) {
			
			int endMoney = 0;
			Slots.Okay(bet, winnings);
			endMoney = (money - bet) + winnings;
			System.out.print("\nYou have " + endMoney + " dollars.");
			return money;
		
			
		}

	}

