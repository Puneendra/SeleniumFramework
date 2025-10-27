package PuniCoreJavaConcepts.Varibles.corejava;

public class Day1
{
int a= 10;
int b=20;
public void meth1()
{
	System.out.println("It is a 1st method");
	System.out.println("puneendra");
	System.out.println("abc");
	
}
public void meth2()
{
	System.out.println("It is a 2nd method");
	System.out.println("puneendra");
	System.out.println("efg");
}
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		Day1 x = new Day1();
		x.meth1();
		x.meth2();
		System.out.println(x.a);
		System.out.println(x.b);

	}

}
