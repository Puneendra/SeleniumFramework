package StringLogigs;

public class EvenOddInString
{
    public static void main(String[] args)
    {
        String str ="samanapunenedrs";

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)%2==0)
                even.append(str.charAt(i));

            if(str.charAt(i)%2==1)
                odd.append(str.charAt(i));
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
