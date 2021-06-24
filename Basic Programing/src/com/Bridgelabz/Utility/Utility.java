package com.Bridgelabz.Utility;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner (System.in);
	}
    public int getIntValue() {
    	return scanner.nextInt();
    	
    	
    }
    public void getPowerOfTwo(int n) {
    	if (n>=0 && n<=31)
    	{
    		int power =1;
    		for (int i=0; i<=n; i++) {
    			power = (1<<i);
    			System.out.println("2^"+i+"="+power);
    		}
    	}
    }
    public void checkLeapYear(int ValueOfYear) {
    	int temp = ValueOfYear, noOfDigit=0;
    	do {
    		noOfDigit++;
    		ValueOfYear /= ValueOfYear/10;
    	}while(ValueOfYear != 0);
    	if(noOfDigit == 4) {
    		
    		if((temp % 4 == 0 || temp % 400 == 0) && temp % 100 == 0){
    			System.out.println(temp+" is a Leap Year");
    		}
    		else 
    			System.out.println(temp+" is not Leap Year");
    		}
    		else 
    			System.out.println(temp+"is not valid Leap Year");
    	}
    public void getHarmonic(int num) {
		float sum = 0;
		for (float i=1;i<=num;i++) {
			sum+=1/i;
		}
		System.out.println("Nth Harmonic Value =" +sum);
		
	}
    public void getPrimeFactor(int num) {
		for(int i=2;i<num;i++) {
			int cnt = 0;
			if (num%i == 0) {
			
				for(int j=2;j<i;j++) {
					if (i%j == 0) {
						cnt = 1;
					}
					
				}
				if (cnt == 0)
					System.out.println("Prime factor = " +i);
			}
		}
    }		
		public void getQuotientRemainder(int Divident,int Divisor) {
				int Quotient , Remainder;
				Remainder = Divident % Divisor;
				Quotient = Divident / Divisor;
				System.out.println("Remainder =" +Remainder+ "Quotient =" +Quotient);
		}
		public void swapNumber(int num1 , int num2){
			int temp ;
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("num1 =" +num1+ "num2 =" +num2);
		}
		public void getLargestnum(int num1,int num2, int num3) {
			int First , Second;
			First = (num1>num2)?num1:num2;
			Second = (First>num3)?First:num3;
			System.out.println(Second+ "is greatest among" +num1+","+num2+","+num3);
		}
		public void getNumber(int num) {
			if(num%2==0)
				System.out.println(num+"is even number");
			else
				System.out.println(num+"is odd number");
			
		}
		public void checkAlphabet(char alphabet) {
			boolean vowel;
			if(alphabet == 'a' || alphabet == 'A')
				vowel = true;
			else if(alphabet == 'e' || alphabet == 'E')
				vowel = true;
			else if(alphabet == 'i' || alphabet == 'I')
				vowel = true;
			else if(alphabet == 'o' || alphabet == 'O')
				vowel = true;
			else if(alphabet == 'u' || alphabet == 'U')
				vowel = true;
			else
				vowel = false;
			if (vowel)
				System.out.println(alphabet+"is vowel");
			else
				System.out.println(alphabet+"is consonant");
		}
		public static void flipCoin(int numberOfFlip) {
			int heads = 0, tails = 0;
			for(int i = 0; i<numberOfFlip; i++) {
				double side = Math.random();
				if(side>0.5) {
					heads++;
				}
				else {
					tails++;
				}
			}
		     System.out.println("Number of head occurance ::" + heads);
		     System.out.println("Number of head occurance ::" + (numberOfFlip-heads));
		     double headPercent = ((heads * 100)/numberOfFlip);
		     double tailPercent = ((tails * 100)/numberOfFlip);
		     System.out.println("Heads Percentage ::" + headPercent + "%");
		     System.out.println("Tails Percentage ::" + tailPercent + "%");

		}
}

		
		
    
    
    
    
   

