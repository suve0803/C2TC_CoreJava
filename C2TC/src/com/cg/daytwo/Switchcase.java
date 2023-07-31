package com.cg.daytwo;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter the choice(1,2,3,4): ");  
		int choice= sc.nextInt(); 
		System.out.println("Chosen Course:");
		switch(choice) {
		case 1:
			System.out.println("Artificial Intellegence ");
			break;
		case 2:
			System.out.println("CyberSecurity ");
			break;
		
		case 3:
			System.out.println("Web Technology ");
			break;
		case 4:
			System.out.println("Networking ");
			break;
		}

	}

}