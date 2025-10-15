package StringLogigs;

public class StringReverseTypes {
    public static void main(String[] args) {


        String str = "Puneendra";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }

        System.out.println(new StringBuffer(str).reverse());



        char[] reverse = str.toCharArray();

        for(int i=reverse.length-1;i>=0;i--)
        {
            System.out.print(reverse[i]);
        }
    }
}