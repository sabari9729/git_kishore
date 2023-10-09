package project1;

import java.util.Scanner;

class OddException extends Exception
{  
 OddException(String message)
 {  
  super(message);  
 }  
}  

public class CheckNumber {

	static void checkeven(int number)throws OddException{  
	     if(number%2==0) { 
	      throw new OddException(" number is add"+number);
	}
	else
	{
		System.out.println("number is even"+number);
	}
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		CheckNumber ch=new CheckNumber();
		int number;
		System.out.println("Enter the number");
		number=s.nextInt();
		try
		{
			ch.checkeven(number);
			System.out.println(number+" is even");
		}
		catch(OddException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
		
		
