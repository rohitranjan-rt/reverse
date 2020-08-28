package com.reverse;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
	String input="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	input = sc.nextLine();
	reverse(input);
	
	}
	
	public static  void reverse(String input) {
		
		System.out.println("Original String : " + input);
		String output1="";
		String output2="";
		String[] inputA = input.split(" ", 0);
			
		int l1 = inputA[0].length();
		int l2 = inputA[1].length();
		
		for(int i = l1 - 1; i>=0; i-- ) {
			output1 = output1 + inputA[0].toString().charAt(i);
		}
		
		for(int j = l2 - 1; j>=0; j-- ) {
			output2 = output2 + inputA[1].toString().charAt(j);
		}
		
		System.out.println("Reversed String : " + output1 + " " + output2);
		}
	}
		
		

