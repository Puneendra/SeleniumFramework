package Youtube;

public class CountLetterAndReplaceTimes
{
    public static void main(String[] args)
    {
        String str =" Sapient India Bruhat Banglore";

        String output ="";
        int count =0;

        char[] ch = str.toCharArray();

        int n = ch.length;


        for(int i=0;i<n;i++)
        {
            if(ch[i]=='a')
            {
                count++;

                output = output + "@" .repeat(count);
            }
            else
                output = output + ch[i];
        }

        System.out.println(output);
    }
}
