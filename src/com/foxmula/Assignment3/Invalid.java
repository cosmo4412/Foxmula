package com.foxmula.Assignment3;
import java.util.*;

class InvalidException extends Exception{
	InvalidException(String s){
		super(s);
	}
}

public class Invalid {
	
	static boolean prime(int n) {
		for(int i=2; i<n; i++) {
			if (n%i == 0) {
				return false;
				
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		try {
			if(n%2!=0 && prime(n)) throw new InvalidException("Invalid Number");
			
			else System.out.println("Valid Number");
		}
		
		catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
	}
}
