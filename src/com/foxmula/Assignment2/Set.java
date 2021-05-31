package com.foxmula.Assignment2;
import java.util.*;

public class Set {
	HashSet<Integer> hs = new HashSet<Integer>();
	 void push(int data) {
		 hs.add(data);
	 }
	 
	 void pop(int data) {
		 hs.remove(data);
	 }
	 
	 void find(int data) {
		 boolean ans = hs.contains(data);
		 if(ans) {
			 System.out.println(data+" Exists in HashSet");
		 }
		 else {
			 System.out.println(data+" Does not exists in HashSet");
		 }
	 }
	 
	 public static void main(String args[]) {
		 Set ob = new Set();
		 while(true) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("1 to push");
			 System.out.println("2 to pop");
			 System.out.println("3 to check existence");
			 System.out.println("4 to exit");
			 int op, data;
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Enter your data");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("Enter data to remove from list");
			 		data = sc.nextInt();
			 		ob.pop(data);
			 		break;
			 case 3: System.out.println("Checking the existence of data");
			 		data = sc.nextInt();
			 		ob.find(data);
			 case 4:
				 	break;
			 default: System.out.println("Select from specified choices");
			 }
			 if (op==4) {
				 break;
			 }
		 }
	 }

}