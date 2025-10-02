package JavaExample;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurences
{
    public static void main(String[] args)
    {
        String str = "samana puneendra";

        char[] let =str.toCharArray();

        Map<Character,Integer> map =new HashMap<>();
        for(char car : let)
        {
            map.put(car,map.getOrDefault(car,0)+1);
        }
        System.out.println(map);

        for(char count : map.keySet())
        {
            if(map.get(count)==3)
            {
                System.out.println(count);
            }
        }

    }
}
