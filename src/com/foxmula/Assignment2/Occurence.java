package com.foxmula.Assignment2;

import java.util.*;
import java.util.Scanner;

public class Occurence {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	 void push(int data) {
		 al.add(data);
	 }
	 
	 void display() {
		 HashSet<Integer> hs = new HashSet<Integer>(al);
		 for (Integer i: hs) {
			 System.out.println(i+" has occured "+Collections.frequency(al, i)+" times");
		 }
	 }	 
	 public static void main(String args[]) {
		 Occurence ob = new Occurence();
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println("1 to push");
			 System.out.println("2 to Display occurences");
			 System.out.println("3 to exit");
			 int op, data;
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter your data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("Occurence");
			 		ob.display();
			 		break;
			 case 3:break;
			 default: System.out.println("Select from mentioned choices");
			 }
			 if (op==3) {
				 break;
			 }
		 }
	 }

}