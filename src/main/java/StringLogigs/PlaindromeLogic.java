package StringLogigs;

public class PlaindromeLogic
{
    public static void main(String[] args)
    {
        String str = "MAM";
        String revword = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            revword = revword + str.charAt(i);
        }

        if(str.equals(revword))

            System.out.println(revword+" it is a palindrom");
        else
            System.out.println(revword+" it is not a palindrom");



    }
}
