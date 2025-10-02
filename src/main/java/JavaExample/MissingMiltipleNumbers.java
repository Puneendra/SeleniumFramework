package JavaExample;

public class MissingMiltipleNumbers
{
    public static void main(String[] args)
    {
        int arr[]= {1,2,4,15};
        boolean found = true;

        for(int i=1;i<=15;i++)
        {
            for(int y : arr )
            {
                if(i==y)
                {
                    found=false;
                    break;
                }
            }
            if (found=true)
            {
                System.out.println(i);
            }
        }


    }
}
