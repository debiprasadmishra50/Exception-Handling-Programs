package exception_handling;

public class Throws_Keyword 
{
	public static void show() throws Exception
	{
		System.out.println("show() method");
	}
	public static void main(String[] args) throws Exception
	{
		show();
//		try {
//			show();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
