package StringLogigs;

public class RemoveSpecialCharacters
{
    public static void main(String[] args)
    {
        String str ="ASqwe!@#$%12";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        String str2="i  a    am    ";
        System.out.println(str2.replaceAll("\\s+"," "));



    }
}
