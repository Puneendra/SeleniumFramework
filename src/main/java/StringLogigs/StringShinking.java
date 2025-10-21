package StringLogigs;

import net.bytebuddy.dynamic.scaffold.MethodGraph;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringShinking
{
    public static void main(String[] args)
    {
    String str ="aaabbcc";

   LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

    for(Character c : str.toCharArray())
    {
        map.put(c,map.getOrDefault(c,0)+1);
    }
        for(Character key :map.keySet())
        {
            System.out.println(key.toString()+map.get(key));
        }

    }
}
