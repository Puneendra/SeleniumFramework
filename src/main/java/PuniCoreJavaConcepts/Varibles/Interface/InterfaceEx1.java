package PuniCoreJavaConcepts.Varibles.Interface;
interface  Bank1
{
	public void meth1();
}
interface Bank2
{
	abstract void meth2();
}
interface Bank3
{
	void meth3();
}

public class InterfaceEx1 implements Bank1,Bank2,Bank3

{
	public void meth1()
	{
		System.out.println("abstract method 1");
	}
	public void meth2()
	{
		System.out.println("Abstrct method2");
	}
	public void meth3()
	{
		System.out.println(" Abstrct Method 3");
	}

	public static void main(String[] args) 
	{
		InterfaceEx1 aobj = new InterfaceEx1();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
	}

}
