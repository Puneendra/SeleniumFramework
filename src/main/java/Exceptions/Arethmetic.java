package Exceptions;

public class Arethmetic
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b=10/0;
            System.out.println(b);

        }
        catch(Exception e)
        {
            System.out.println(e);//e.getMessage()
        }
        finally
        {
            System.out.println("successfully executed ");
        }

    }
}
