package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class Quotientandremainder {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Divident :");
		int Divident = utility.getIntValue();
		System.out.println("Enter Divisor :");
		int Divisor = utility.getIntValue();
		utility.getQuotientRemainder(Divident, Divisor);
		
		
		

	}

}
