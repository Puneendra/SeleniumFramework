package ArrayPrograms;

public class PrimeNumberOrnot
{
    public static void main(String[] args)
    {
        int b = 10;

        boolean prime = true;

       for(int i=2;i<b;i++)
       {
           if(b%i==0)
           {
               prime=false;
           }
       }
       if(prime)
           System.out.println("Prime Number");
       else
           System.out.println("Not Prime Number");

    }
}
