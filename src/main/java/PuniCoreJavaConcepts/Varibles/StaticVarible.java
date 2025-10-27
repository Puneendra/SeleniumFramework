package PuniCoreJavaConcepts.Varibles;

public class StaticVarible
{
public static int a= 20;
static int b =30;
public void meth1()
{
	System.out.println("1st method");
}
public static void meth2()
{
	System.out.println("1st static method");
}
static void meth3()
{
	System.out.println("2nd static method");
}
	public static void main(String[] args)
	{
		meth2();
		meth3();
		System.out.println(a);
System.out.println(b);
	}

}
