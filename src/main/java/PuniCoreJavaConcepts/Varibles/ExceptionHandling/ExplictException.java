package PuniCoreJavaConcepts.Varibles.ExceptionHandling;

public class ExplictException 
{
	static void vote(int age)
	{
		if(age<18)
		{
			try 
			{
				throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("NOT Eligible for vote ");
			}
			
			
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}

	public static void main(String[] args)throws InterruptedException
	{
		vote(10);

	}

}
