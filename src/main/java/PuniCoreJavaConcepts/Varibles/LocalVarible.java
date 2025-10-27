package PuniCoreJavaConcepts.Varibles;

public class LocalVarible 
{
	public void meth1()
	{
		int a= 10;//Local Varible
		System.out.println("1st mehtod");
		System.out.println(a);
		
	}
public void meth2()
{
	int b= 10;//Local Varible
	System.out.println("2nd mehtod");
	System.out.println(b);
}
	public static void main(String[] args)
	{
		System.out.println("Start The Programe");
	
LocalVarible aobj = new LocalVarible();
aobj.meth1();
aobj.meth2();

	}

}
