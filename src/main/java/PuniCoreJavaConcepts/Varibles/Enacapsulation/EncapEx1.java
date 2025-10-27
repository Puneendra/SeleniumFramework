package PuniCoreJavaConcepts.Varibles.Enacapsulation;

public class EncapEx1 
{
	private String name;
	private int age;
	public void meth1(String y)
	{
	name = y;
	}
	public void meth2(int x)
	{
		age=x;
	}
	public void meth3()
	{
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) 
	{
		EncapEx1 aobj = new EncapEx1();
		aobj.meth1("Puneendra");
		aobj.meth2(35);
		aobj.meth3();
		
		

	}

}
