package Youtube;

import java.util.HashSet;
import java.util.Set;

public class FirstOccurencePrint
{
    public static void main(String[] args)
    {
        String str = "Programming";
        String output ="";

       char[] ch  = str.toCharArray();

        Set<Character> set = new HashSet<Character>();

        for(char c : ch)
        {
            if(!set.contains(c))
            {
                set.add(c);
                output= output+c;
            }
        }
        System.out.println(output);

    }
}
