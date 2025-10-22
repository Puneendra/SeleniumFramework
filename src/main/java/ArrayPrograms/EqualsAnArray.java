package ArrayPrograms;

import java.util.Arrays;

public class EqualsAnArray
{
    public static void main(String[] args)
    {
        int arr1[] ={1,2,3,4,5};
        int arr2[] ={1,2,3,4,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
            System.out.println("Given arrays are the same");
        else
            System.out.println("Given arrays are not the same");
    }
}
