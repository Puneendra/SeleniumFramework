package ArrayPrograms;

import java.util.Arrays;

public class MergingArrays
{
    public static void main(String[] args)
    {
        int arr1 []={1,2,3,4,5};
        int arr2[]={7,8,9,10};

        int result[] = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++)
        {
            result[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
            {
            result[arr1.length+j]=arr2[j];
            }
        System.out.println(Arrays.toString(result));

    }
}
