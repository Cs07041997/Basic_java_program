package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class ChecklargestNum {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the first number : ");
		int deepak = utility.getIntValue();
		System.out.println( "Enter the second value : ");
		int deepak1 = utility.getIntValue();
		System.out.println("Enter the third value : ");
		int num3 = utility.getIntValue();
		utility.getLargestnum(deepak,deepak1,num3);

	}

}
