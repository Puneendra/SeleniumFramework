package JavaExample;

public class FabnacciSeris
{
    public static void main(String[] args)
    {
    int first =0;
    int second=1;
    int temp;
    for(int i=0;i<=15;i++)
    {
        temp=first+second;
        first=second;
        second=temp;
        System.out.println(temp);
    }

    }
}
