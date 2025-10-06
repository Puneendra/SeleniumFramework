package Exceptions;

import java.sql.SQLOutput;

public class ArrayIndex {
    public static void main(String[] args)
    {

        try
        {
            int arr[]={1,2,3,4,5,6,7};
            System.out.println(arr[10]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally

        {
            System.out.println("printing from finally block");
        }

    }



}
