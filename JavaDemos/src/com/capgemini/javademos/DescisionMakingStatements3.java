package com.capgemini.javademos;

public class DescisionMakingStatements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;

		
		 if (number == 5) 
		  { 
		  if (number >= 5) 
		  {
		  	System.out.println("number is greater than 5"); 
		   }
		  else 
		  {
		  System.out.println("number is smaller than 5"); 
		  } 
		 }
		
		if(number == 5)
		{
			System.out.println("number equals to 5");
		}
		else if(number > 5)
		{
			System.out.println("number is greater to 5");		
		}
		else 
		{
			System.out.println("number is smaller than 5");
		}


	}

}
