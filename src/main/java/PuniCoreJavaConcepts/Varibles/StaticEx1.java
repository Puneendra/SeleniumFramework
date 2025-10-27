package PuniCoreJavaConcepts.Varibles;

public class StaticEx1 
{
	static int x= 0;
	public void meth1()
	{
		x++;
	}

	public static void main(String[] args)
	{
		StaticEx1 aobj = new StaticEx1();
		aobj.meth1();	
		System.out.println(aobj.x);

		
		StaticEx1 aobj1 = new StaticEx1();
		aobj1.meth1();	
		System.out.println(aobj1.x);
	}

}
