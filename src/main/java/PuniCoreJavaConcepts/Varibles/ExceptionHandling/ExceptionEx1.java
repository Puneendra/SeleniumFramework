package PuniCoreJavaConcepts.Varibles.ExceptionHandling;

public class ExceptionEx1
{

	public static void main(String[] args) 
	{
		try
		{
			

			int x[] = {10,20,30,40,50};
			System.out.println("Programe starting");
			System.out.println(x[9]);	// x[0]	// Here we got an exception then below statements are not executed	
            System.out.println("statement 1");		
            System.out.println("statement 2");
			
}
		catch(Exception x)
		{
			System.out.println(x);
			System.out.println("Catch block of statement is executed ");
			
		}
		finally
		{
			System.out.println("Irrespective of an error always finally block is executed");
		}
}
}