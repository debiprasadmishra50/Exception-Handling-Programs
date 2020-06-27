package exception_handling;

import java.util.InputMismatchException;

class AgeException extends RuntimeException
{
	public AgeException(String message)
	{
		super(message);
	}
}
public class RunTimeException_Ex 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter age");
		try {
			int age = sc.nextInt();
			if(age < 18)
				throw new AgeException("Underage");
		}
		catch (AgeException e) 
		{
			System.out.println("You are not eligible to vote : "+e.getMessage());
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Enter a number only");
		}
	}
}
