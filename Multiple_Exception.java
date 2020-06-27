package exception_handling;

public class Multiple_Exception 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Started");
		
		try 
		{
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		} 
//		catch (ArrayIndexOutOfBoundsException e) 
//		{
//			System.out.println("ArrayIndexOutOfBoundsException Caught");
//		}
//		catch (ArithmeticException e) 
//		{
//			System.out.println("ArithmeticException Caught");
//		}
//		catch (NumberFormatException e) 
//		{
//			System.out.println("NumberformatException Caught");
//		}
		catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("Terminated Normally");
	}
}
