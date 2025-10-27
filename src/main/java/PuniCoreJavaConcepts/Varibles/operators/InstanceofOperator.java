package PuniCoreJavaConcepts.Varibles.operators;

public class InstanceofOperator
{
    public static void main(String[] args) 
    {
        String s = "Java";
        System.out.println("s instanceof String: " + (s instanceof String));
        Object obj = s;
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Object: " + (obj instanceof Object));
    }
}

