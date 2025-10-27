package PuniCoreJavaConcepts.Varibles.ExceptionHandling;

public class NullpointerException 
{

	public static void main(String[] args)
	{
	try
	{
		String puni =null;
		System.out.println(puni.length());
		
	}
	catch (Exception puni)
	{
		System.out.println(puni);
	}
	finally
	{
		System.out.println("Program  ends");
	}

	}

}
