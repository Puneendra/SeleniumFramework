package JavaExample;

public class FindingDuplicateUniqueNumbers
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,3,4,4,5,5,6,6,8,8};
        boolean visited[] = new boolean[arr.length];
        for (int i=0;i<arr.length;i++)
        {
            if(visited[i]==true)
                continue;
            boolean duplicate=false;
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]==arr[i])
                    {
                        duplicate=true;
                        visited[j]=true;
                    }
                }
                if(duplicate)
                {
                    System.out.println(arr[i]);
                }
            }

        }

    }
}
