package com.capgemini.javademos;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char number = 'F';
		switch (number) 
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of number is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of number is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of number is c");
			break;
		default:
	System.out.println("The value of number is other than a,b,c");
			break;
		}


	}

}
