package com.Bridgelabz.Program;
import java.util.Scanner;
import com.Bridgelabz.Utility.Utility;

public class Alphabet {

	public static void main(String[] args) {
    Utility utility = new Utility();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Alphabet : " );
    char Alphabet = sc.next().charAt(0);
    utility.checkAlphabet(Alphabet);
    
  }
}
