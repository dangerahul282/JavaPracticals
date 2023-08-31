package com.java.intro;
public class Swapping{

	public static void main(String[] args) {
		//Swaping of two numbers
		int a,b,temp;
		a = 10;
		b = 30;
		
		//Print a and b before Swapping

		System.out.println("a before swapping " + a);
		System.out.println("b before swapping " + b);
		
		//swapp a and b using third variable

		temp = a;
		a = b;
		b = temp;

		//Print a and b after Swapping

		System.out.println("a after swapping " + a);
		System.out.println("b after swapping " + b); 
		
	}

}
		
		