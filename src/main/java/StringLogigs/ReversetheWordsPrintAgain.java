package StringLogigs;

public class ReversetheWordsPrintAgain
{
    public static void main(String[] args)
    {
        String str ="I love java";
        String rev= "";

        for(String word : str.split(" "))
        {
            rev=rev+" "+word;
        }
        System.out.println(str+" "+rev);

    }
}
