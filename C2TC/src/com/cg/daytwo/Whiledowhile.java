package com.cg.daytwo;

public class Whiledowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---while loop---");
		int i=0;
		while(i<10) {
			i++;
			System.out.println(i);
		}
		System.out.println("---dowhile loop---");
		int n=0;
		do {
			System.out.println(n);
			n++;
		}while(n<10);
	}

}