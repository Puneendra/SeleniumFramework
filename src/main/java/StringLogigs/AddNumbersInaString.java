package StringLogigs;

import java.util.Scanner;

public class AddNumbersInaString
{
    public static void main(String[] args)
    {
        String str = "pa1i1love2and3";
        int result =0;

        StringBuilder number = new StringBuilder();

        for(Character ch : str.toCharArray())
        {
            if(Character.isDigit(ch ))
            {
result=result+Character.getNumericValue(ch);
            }
        }
        System.out.println(result);


    }
}
