package PuniCoreJavaConcepts.Varibles.ExceptionHandling;

public class NumberformatException
{

	public static void main(String[] args) 
	{
		try 
		{
			String x = "PUNEENDRA";
			String y = "50";
			
			System.out.println(x+y);
			System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
			
			
			System.out.println(Integer.valueOf(x)+Integer.valueOf(x));
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		

	}

}
