package PuniCoreJavaConcepts.Varibles.Abstraction;

public  abstract class  Puni 
{
	abstract void meth1();
	abstract void meth2();
	
	
	public void meth3()
	{
		System.out .println("conqurit Method");
	}
}
	class ClassA extends Puni
	{
		public void meth1()
		{
			System.out.println("Using abstarct method 1");
		}
		public void meth2()
		{
			System.out.println("Using abstract method 2");
		}
	
	public static void main(String[] args)
	{
	ClassA  aobj = new ClassA ();
	aobj.meth1();
	aobj.meth2();

	}

}

