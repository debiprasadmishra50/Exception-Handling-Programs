package exception_handling;

public class Throw_Keyword 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Started");
		try {
			throw new Exception();
		}
		catch (Exception e) 
		{
			System.out.println("Exception by Throw keyword caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Terminated Normally");
	}
}
