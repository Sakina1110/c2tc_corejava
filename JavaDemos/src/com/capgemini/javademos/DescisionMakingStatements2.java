package com.capgemini.javademos;

public class DescisionMakingStatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int firstNumber = 10; int secondNumber = 11;
		  
		  if(!(firstNumber < secondNumber) || (firstNumber == secondNumber))
		  { 
			  System.out.println("Condition is TRUE");
		  }
		  else
		  { 
			  System.out.println("Condition is FALSE"); 
		}
		 

		
		int ageOfBoy = 36;
		int ageOfGirl = 25;

		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) 
		{
			System.out.println("ready to get married!");
		} 
		else 
		{
			System.out.println("Wait for it kiddo!");
		}


	}

}
