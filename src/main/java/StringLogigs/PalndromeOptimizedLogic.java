package StringLogigs;

public class PalndromeOptimizedLogic
{
    public static void main(String[] args)
    {
        String str = "MADAM";

        boolean palindrome = true;

        for (int i = 0; i < str.length() / 2; i++)
        {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
            {
                palindrome = false;
                break;
            }
        }
        if (palindrome)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");







    }
}

