package StringLogigs;

public class FirstLetterCapital
{
    public static void main(String[] args)
    {
        String str = "i love java selenium and i love my country";
        StringBuilder result = new StringBuilder();

        for(String word : str.split(" "))
        {
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(result);

    }
}
