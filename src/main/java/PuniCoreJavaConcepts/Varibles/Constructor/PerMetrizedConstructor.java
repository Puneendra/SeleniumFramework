package PuniCoreJavaConcepts.Varibles.Constructor;

public class PerMetrizedConstructor 
{
    int x; // Declare instance variable inside the class body

    public PerMetrizedConstructor(int y)
    {
        x = y;
    	//y=x;it gives 0
    }

    public static void main(String[] args)
    {
        PerMetrizedConstructor aobj = new PerMetrizedConstructor(100);
        System.out.println("value of x :" + aobj.x);
    }
}
