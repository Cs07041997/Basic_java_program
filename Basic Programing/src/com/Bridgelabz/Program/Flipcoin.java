package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class Flipcoin {

		public static void main(String[] args) {
			Utility utility = new Utility();
			System.out.println("Enter number of time to flip");
			int numberOfFlip = utility.getIntValue();
			utility.flipCoin(numberOfFlip);
		}
	}

	