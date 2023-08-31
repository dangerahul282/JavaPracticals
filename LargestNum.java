package com.java.intro;
public class LargestNum{

	public static void main(String[] args) {
             //Java Program to Find the Largest Among Three Numbers
		int n1 = 4, n2 = 3, n3 = 2;

	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the largest number.");

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the largest number.");

	        else
	            System.out.println(n3 + " is the largest number.");
		
		}
}
