package StringLogigs;

public class ReverseWords
{
    public static void main(String[] args)
    {
        String str = "I love java and java loves me";

        String result = "";

       String[] reverse =  str.split(" ");

       for(String word : reverse)
       {
           String revword = "";
           for(int i=word.length()-1;i>=0;i--)
           {
               revword=revword+word.charAt(i);

           }
           result=result+revword+" ";


       }

        System.out.println(result);
    }
}
