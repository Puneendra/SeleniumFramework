package PuniCoreJavaConcepts.Varibles.Polymorphysim;

public class MethodOverLoading 
{
	public void add(int a, int b)
	{
		System.out.println("addition of two numbers  " +(a+b));
	}
	public void add(int a, int b ,int c)
	{
		System.out.println("addition of three numbers  " +(a+b+c));
	}
	public void add(double a, double b)
	{
		System.out.println("addition of two numbers  " +(a+b));
	}

	public static void main(String[] args) 
	{
		MethodOverLoading aobj = new MethodOverLoading ();
		aobj.add(10, 20);
		aobj.add(10,20,30);
		aobj.add(22.5, 20.50);

	}

}
