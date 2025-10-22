package ArrayPrograms;

public class Fanacciseris
{
    public static void main(String[] args)
    {
        int first =0;
        int second =1;
        int result;
        for(int i=0;i<=15;i++)
        {
            result=first+second;
            first=second;
            second=result;
            System.out.println(result);
        }
    }
}
