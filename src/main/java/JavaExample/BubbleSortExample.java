package JavaExample;

import java.util.Arrays;

public class BubbleSortExample
{
    public static void main(String[] args)
    {
        int arr[] = {33,65,55,100,105,89,3,4,5,99};

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
            if(i==0)
            {
                System.out.println(arr[arr.length-1]);
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
