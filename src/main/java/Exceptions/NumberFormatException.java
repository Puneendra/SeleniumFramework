package Exceptions;

public class NumberFormatException
{
    public static void main(String[] args)
    {
        try
        {
            int a= 20;
            String b= "puni";

            System.out.println(a+b);
            System.out.println(Integer.parseInt(a+b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
