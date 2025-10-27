package PuniCoreJavaConcepts.Varibles.Constructor;

public class Constructor1
{
	
public Constructor1()
{
	System.out.println("Constructor example it will automatically executed");
}
public void meth1() 
{
	
	System.out.println("1st method ");
}

	public static void main(String[] args)
	{
		System.out.println("It is also called as default constructor");
		Constructor1 aobj = new Constructor1 ();
		aobj.meth1();

	}

}
