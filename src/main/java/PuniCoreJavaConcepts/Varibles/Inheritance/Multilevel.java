package PuniCoreJavaConcepts.Varibles.Inheritance;

 class Multilevel 
{
	public void meth1()
	{
		System.out.println("HI");
	}
}


	class ClassE extends Multilevel
	{
		public ClassE()
		{
			System.out.println("Constructor child class");
		}
		public void meth2()
		{
			System.out.println("1st child class");
		}
	}
	
	class ClassM extends ClassE
	{
		public void meth3()
		{
			System.out.println("2nd Clild class");
		}
	
	
	
	public static void main(String[] args) 
	{
		ClassM aobj = new ClassM ();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
	}	

	}

	
 
 
