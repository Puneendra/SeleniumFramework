package StringLogigs;

public class PrintingEachCharacterTwise
{
    public static void main(String[] args)
    {
        String str = "hello";

        StringBuilder result = new StringBuilder();


        for(char ch : str.toCharArray())
        {
            if(ch =='l')

                result.append(ch);

            else
                result.append(ch).append(ch);

        }

        System.out.println(result);

    }

}
