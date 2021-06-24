package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class CheckNumber {
	

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number");
        int number = utility.getIntValue();
        utility.getNumber(number);

	}

}
