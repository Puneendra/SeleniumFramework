package StringLogigs;

public class StringFilter
{
    public static void main(String[] args)
    {
    String str ="abc123ABC";
    StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        StringBuilder didgit = new StringBuilder();

        for(Character ch : str.toCharArray())
        {
            if(Character.isUpperCase(ch))
                upper.append(ch);

            if(Character.isLowerCase(ch))
                lower.append(ch);
            if(Character.isDigit(ch))
                didgit.append(ch);
        }

        String result = upper.toString()+lower.toString()+didgit.toString();
        System.out.println(result);

    }
}
