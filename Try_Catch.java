package exception_handling;

public class Try_Catch 
{
	public static void main(String[] args) 
	{
		System.out.println("Exceution Started");
		try 
		{
			System.out.println(args[0]);
		}
		catch(Exception e)
		{
//			System.out.println("Please give value from command line");
//			System.out.println(e.getMessage());	//why
//			System.out.println(e); 	//what and why
			e.printStackTrace(); 	// Details about Exception
		}
		System.out.println("Terminated Normally");
	}
}
