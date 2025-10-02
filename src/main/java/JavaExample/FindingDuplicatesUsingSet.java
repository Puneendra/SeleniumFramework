package JavaExample;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicatesUsingSet
{
    public static void main(String[] args)
    {
        int arr[] = {1,1,2,2,3,3,4,5,6,6};

        Set <Integer> duplicates = new HashSet<Integer>();

        for(int y :arr)
        {
            if(duplicates.add(y)==false)
            {
                System.out.println(y);
            }
        }

    }
}
