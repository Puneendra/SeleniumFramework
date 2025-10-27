package PuniCoreJavaConcepts.Varibles.ExceptionHandling;

public class MiltipleCatchBlocks
{

	public static void main(String[] args) 
	{
		try
		{
			int x=10/0;        // change the condition change 0 to 30 ;
					System.out.println(x);
			
			String name = "30";
			name= null;
			System.out.println(name.length());
		}
		catch(ArithmeticException x)
		{
			System.out.println(x);
		}
		catch(NullPointerException name)
		{
			System.out.println(name);
		}

	}

}
