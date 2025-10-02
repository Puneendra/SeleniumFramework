package JavaExample;

public class LargestandSmallestUsingLoops
{
    public static void main(String[] args)
    {
        int arr[]= {2,10,1,9,7,6,3,4,5,8};

        int large= arr[0];
        int small=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>large)
                large=arr[i];
            if(arr[i]<small)
                small=arr[i];

        }
        System.out.println(small +";"+ large);


    }
}
