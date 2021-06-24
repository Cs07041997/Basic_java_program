package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class Swap {

		public static void main(String[] args) {
		    Utility utility = new Utility();
		    System.out.println("Enter num1: ");
		    int num1 = utility.getIntValue();
		    System.out.println("Enter num2 : ");
		    int num2 = utility.getIntValue();
		    utility.swapNumber(num1,num2);

	}

}
