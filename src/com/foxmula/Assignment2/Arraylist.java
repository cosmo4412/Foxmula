package com.foxmula.Assignment2;
import java.util.*;

public class Arraylist {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	 void push(int data) {
		 al.add(data);
	 }
	 
	 void pop(int data) {
		 al.remove(data);
	 }
	 
	 void find(int data) {
		 boolean ans = al.contains(data);
		 if(ans) {
			 System.out.println(data+"Exists in ArrayList");
		 }
		 else {
			 System.out.println(data+" Does not exists in ArrayList");
		 }
	 }
	 
	 public static void main(String args[]) {
		 Arraylist ob = new Arraylist();
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println("1 to Push");
			 System.out.println("2 to Pop");
			 System.out.println("3 to check");
			 System.out.println("4 to exit");
			 int op, data;
			 boolean val = true;
			 op = sc.nextInt();
			 switch(op) {
			 case 1: System.out.println("Data: ");
				 	data = sc.nextInt();
			 		ob.push(data);
			 		break;
			 case 2: System.out.println("Enter data to remove: ");
			 		data = sc.nextInt();
			 		ob.pop(data);
			 		break;
			 case 3: System.out.println("Checking for existence: ");
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