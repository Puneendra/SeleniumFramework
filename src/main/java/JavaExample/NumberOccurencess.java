package JavaExample;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurencess
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,3,2,1,1,4,4};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);

        for(int count : map.keySet())
        {
            if(map.get(count)==2)
            {
                System.out.println(count);

            }
        }

    }

}
