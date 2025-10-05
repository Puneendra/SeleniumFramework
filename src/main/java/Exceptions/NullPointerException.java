package Exceptions;

public class NullPointerException
{
    public static void main(String[] args)
    {
        try
        {
            String s ="puni";
            s=null;
            System.out.println(s.length());
        }
        catch(Exception e)
            {
            System.out.println(e);
            }

    }
}
