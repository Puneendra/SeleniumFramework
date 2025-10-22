package StringLogigs;

public class ExpandOccuences
{
    public static void main(String[] args)
    {
        String str ="A4b4c2";

        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if(Character.isLetter(ch))
            {
                if(i+1<str.length() && Character.isDigit(str.charAt(i+1)))
                {
                    int count = Character.getNumericValue(str.charAt(i+1));
                    for(int j=0;j<count;j++)
                    {
                        result.append(ch);
                    }

                }
            }


        }
        System.out.println(result);


    }
}
