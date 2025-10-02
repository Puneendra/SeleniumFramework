package JavaExample;

public class EvenandOdd
{
    public static void main(String[] args)
    {
        int arr [] ={1,2,3,4,5,6,7,8,9,10};

        for(int y :arr)
        {
            if(y%2==0)
            {
                System.out.println("odd numbers"+y);
            }
            else
                {
                System.out.println("even numbers"+y);
                }

        }

    }
}
