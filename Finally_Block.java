package exception_handling;

public class Finally_Block 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Execution Started");
		try 
		{
			System.out.println("try block");
//			System.exit(0);
			throw new Exception();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Caught");
			try{
				throw new Exception();
			}catch (Exception e1) {
				System.out.println("Exception inside try");
			}
		}
		finally 
		{
			System.out.println("Terminated Normally");
		}
		
	}
}
