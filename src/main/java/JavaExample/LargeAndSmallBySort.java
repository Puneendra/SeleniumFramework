package JavaExample;

import java.util.Arrays;

public class LargeAndSmallBySort
{
    public static void main(String[] args)
    {
    int arr[]={4,10,3,2,1,9,8,7,5,6};

    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
