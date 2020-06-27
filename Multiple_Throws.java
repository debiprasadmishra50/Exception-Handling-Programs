package exception_handling;

public class Multiple_Throws 
{
	void show() throws Exception
	{
		System.out.println("show() ");
		throw new Exception();
	}
	void display() throws Exception
	{
		System.out.println("display()");
		show();
	}
	public static void main(String[] args) throws Exception 
	{
//		new Multiple_Throws().display();
		try{
			new Multiple_Throws().display();
		}catch (Exception e) {
			System.out.println("Exception Caught : Handled by Caller");
		}
		
		System.out.println("Terminated Normally");
	}
}
