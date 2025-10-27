package PuniCoreJavaConcepts.Varibles.operators;

public class BitwiseShiftOperators
{
    public static void main(String[] args)
    {
        int a = 12, b = 5;
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 1: " + (a >> 1));
        System.out.println("a >>> 1: " + (a >>> 1));
    }
}

