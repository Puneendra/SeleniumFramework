package Youtube;

import java.util.HashMap;
import java.util.Map;

public class OccurenceWithMap
{
    public static void main(String[] args)
    {
    Map<String, Integer> map = new HashMap<String,Integer>();

    map.put("a", 1);
    map.put("b", 4);
    map.put("c", 2);
    map.put("d", 3);

    for(Map.Entry<String, Integer> entry :map.entrySet())
    {
        int n= entry.getValue();
        {
            for(int i=1;i<n;i++)
            {
                System.out.println(entry.getKey());
            }
        }
    }

    }
}
