package PuniCoreJavaConcepts.Varibles.Inheritance;

public class ClassB 
{
	public void meth1()
	{
		System.out.println("1st method is executed");
		System.out.println("Parent Mehtod");
	}
}

class ClassA extends ClassB

{
	public ClassA()
	{
		System.out.println("Child class");
	}
	

	public static void main(String[] args)
	{
	
ClassA aobj = new ClassA();

aobj.meth1();
	}

	}
