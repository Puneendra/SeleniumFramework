package Exceptions;

public class ArrayIndex
{
    public static void main(String[] args)
    {
        try
        {
            int arr[]= {1,2,3,4,5};

            System.out.println(arr[10]);
        }
        catch(Exception e)
        {
            System.out.println(e);  //e.getMessage();
        }
        finally
        {
            System.out.println("i love java ");
        }

    }
}
