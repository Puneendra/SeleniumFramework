package PuniCoreJavaConcepts.Varibles.ExceptionHandling;

public class ArethimeticException 
{

	public static void main(String[] args)
	{
	try
	{
		int x= 10/0;
		System.out.println(x);
		System.out.println("Try statement ");
	}
	catch (Exception x)
	{
		System.out.println(x);
	}

	
	finally
	{
		System.out.println("ends the program");
	}

}
}