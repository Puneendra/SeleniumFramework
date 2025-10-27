package PuniCoreJavaConcepts.Varibles.Polymorphysim;

public class MethodOverRiding 
{
	public void meth1(int x)
	{
		System.out.println(x+x);
	}
}
class  Puni extends MethodOverRiding

{
	
	 public void  meth1(int x)
	{
		System.out.println(x+x);
	}

	public static void main(String[] args) 
	{
		Puni bobj = new Puni ();
		bobj.meth1(30);
		
		MethodOverRiding aobj = new MethodOverRiding ();
		aobj.meth1(10);
		
		
		

	}

}
