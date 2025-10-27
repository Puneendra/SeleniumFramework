package PuniCoreJavaConcepts.Varibles;

public class InstanceVarible 
{

	int a = 10;
	int b = 30;
		public void meth1()
		{
			int a= 10;//Local Varaible
			System.out.println("1st mehtod");
			System.out.println(a);
			
		}
	
		public static void main(String[] args)
		{
			System.out.println("Calling the Local varible");
		
			InstanceVarible aobj = new InstanceVarible();
			System.out.println(aobj.a);
			System.out.println(aobj.b);

		}

	}
