package ArrayPrograms;

public class SortedArray
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4 , 20};

        boolean sorted = true;

        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                sorted = false;
                break;
            }
        }
        if(sorted)

            System.out.println("Sorted Array");
        else
            System.out.println("Not Sorted Array");

    }
}
