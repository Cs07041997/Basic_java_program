package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;
public class Leapyear {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the year to check the leap year or not");
		int ValueOfYear = utility.getIntValue();
		utility.checkLeapYear( ValueOfYear); 
			
		

	}

}