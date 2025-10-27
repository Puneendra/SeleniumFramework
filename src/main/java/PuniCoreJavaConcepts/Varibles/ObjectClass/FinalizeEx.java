package PuniCoreJavaConcepts.Varibles.ObjectClass;

public class FinalizeEx
{
protected void finalize()
{
	System.out.println("Finalize Method is calling ");
}
	public static void main(String[] args)
	{
		FinalizeEx aobj = new FinalizeEx();
		
		aobj = null;//Requesting to JVM to run Garbage Collector
		
	//	aobj.finalize();//===>Null pointer Exception

		System.gc(); // Suggest JVM to run Garbage Collector                                                        
		
		

	}

}
