package PuniCoreJavaConcepts.Varibles.ObjectClass;

public class Puni
{
	public void meth1()
	{
		System.out.println("Method one is called");
	}

	public static void main(String[] args)
	{
		Puni aobj1 = new Puni();
		Puni aobj2 = new Puni();
		
		//--->hashCode();
		System.out.println(aobj1.hashCode());
		System.out.println(aobj2.hashCode());
		
		//-->equals();
		System.out.println(aobj1.equals(aobj2));
		System.out.println(aobj1.equals(aobj1));
		
		//--->getClass();
		System.out.println(aobj1.getClass());
		
		//-->toString();
		System.out.println(aobj1.toString());
		System.out.println(aobj2.toString());

	}

}
