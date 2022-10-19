package com.capgemini.javademos;

public class LoopingStatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		boolean isPrime = true;
		for(int counter = 2; counter < number/2; counter++)
		{
			if(number % counter == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true)
		{
			System.out.println("The number is a prime number");
		}
		else
		{
			System.out.println("The number is not a prime number");
		}


	}

}
