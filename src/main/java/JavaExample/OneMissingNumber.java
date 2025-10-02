package JavaExample;

public class OneMissingNumber
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,5};
        int n=5;
        int sum=0;
        int result = (n*(n+1)/2);

        for (int i =0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(result-sum);

    }
}
