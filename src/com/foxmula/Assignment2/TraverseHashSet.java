package com.foxmula.Assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class TraverseHashSet {
	HashSet<Integer> hs = new HashSet<Integer>();
	
	 void push(int data) {
		 hs.add(data);
	 }
	 
	 void display() {
		 Iterator<Integer> it = hs.iterator();
		 while(it.hasNext()){
			System.out.print(it.next()+" "); 
		 }
		 System.out.println();
	 }
	 
	 public static void main(String args[]) {
		 TraverseHashSet ob = new TraverseHashSet();
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println("1 to push");
			 System.out.println("2 to display");
			 System.out.println("3 to exit");
			 int op, data;
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter your data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("Displaying the Items");
			 		ob.display();
			 		break;
			 case 3:
				 break;
			 default: System.out.println("Select from specified choices");
			 }
			 if (op==3) {
				 break;
			 }
		 }
	 }
}