package ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsTypes {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3,};

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j<arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }

        }


        Integer[] arr3 = {1, 2, 3, 4, 5};
        Integer[] arr4 = {1, 2, 3, 4, 5};

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr4));

        set1.retainAll(set2);
        System.out.println(set1);




    }
}