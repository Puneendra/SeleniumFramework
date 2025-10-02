package JavaExample;

import java.util.HashMap;
import java.util.Map;

public class WordOccurences
{
    public static void main(String[] args)
    {
        String str = "i love java java loves me i love java";

      String[] words =   str.split(" ");

      Map<String ,Integer> word = new HashMap<>();
      for(String occur : words)
      {
          word.put(occur,word.getOrDefault(occur,0)+1);

      }
        System.out.println(word);

      for(String count :word.keySet())
      {
          if(word.get(count)==2)
          {
              System.out.println(count);
          }
      }

    }
}
