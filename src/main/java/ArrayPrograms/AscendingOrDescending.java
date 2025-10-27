package ArrayPrograms;

public class AscendingOrDescending
{
    public static void main(String[] args)
    {
    //int arr[]  ={1,2,3,4,5,6,7,};
//        int arr[] ={9,8,7,6,5};
        int arr[] ={1,-2,4,5};
            boolean ascending = true;
           boolean descending = true;

           for(int i=0;i<arr.length-1;i++)
           {
               if(arr[i]>arr[i+1])  ascending =false;

               if(arr[i]<arr[i+1])  descending =false;
           }
    if(ascending)
        System.out.println("given array is an ascending");
    else if(descending)
        System.out.println("given array is descending");
    else
        System.out.println("given array is damal ");

    }
}
