package JavaExample;

import java.util.Arrays;
import java.util.Comparator;

public class SortBySecondValue
{
    public static void main(String[] args)
    {
        Integer  arr[] = {29,36,35,38,27,23,32,11};  // Integer

        Comparator<Integer>cmp = (a, b)-> a%10-b%10;

        Arrays.sort(arr,cmp);   // arr,cmp
        System.out.println(Arrays.toString(arr));



    }
}
