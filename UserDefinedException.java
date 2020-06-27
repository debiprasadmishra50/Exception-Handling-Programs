package exception_handling;

import java.util.InputMismatchException;

class EvenException extends Exception{

}
class ZeroException extends Exception {

}
class MinusException extends Exception{
	
}
public class UserDefinedException 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		try
		{
			int no = sc.nextInt();
			if(no < 0)
				throw new MinusException();
			for (int i = 0; i <= no; i++) 
			{
				try 
				{
					if (i == 0)
						throw new ZeroException();
					if (i % 2 == 0)
						throw new EvenException();
					else
						System.out.println(i + " is a odd number");
				} catch (EvenException e) 
				{
					System.out.println(i + " is a even number");
				} catch (ZeroException e) 
				{
					System.out.println("0 is neither Even nor Odd");
				}
			}
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Enter a number only");
		}
		catch (MinusException e) 
		{
			System.out.println("Enter Positive Number Only");
		}
		System.out.println("Terminated Normally");
	}
}
