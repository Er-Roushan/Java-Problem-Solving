/*
 * Given an array of integers, write a method to remove all duplicates elements from the array.
 * The method should return a new array that contains only the unique elements fro the original
 * array, maintaining their original order.
 */

package Array;

import java.util.*;

public class Program14a {

    //Method to remove duplicates and trim the array containing the unique value
    public static int[] removeDuplicates(int[] arr) {

        int[] newArray = new int[arr.length];
        newArray[0] = arr[0];
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            int j = 0;
            for (; j < k; j++) {
                if (arr[i] == newArray[j]) {
                    break;
                }
            }
            if (j == k) {
                newArray[k] = arr[i];
                k++;
            }
        }
        // HashSet<Integer> hs = new HashSet();
        // for(int i=0; i<arr.length; i++){
        //     hs.add(arr[i]);
        // }
        // for (Object o : hs) {
        //     System.out.println(o);
        // }

        //triming of array
        int[] b = Arrays.copyOf(newArray, k);
        return b;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = obj.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = obj.nextInt();
        }
        //function call
        int[] returnArr = removeDuplicates(arr);
        for (int i = 0; i < returnArr.length; i++) {
            System.out.println(returnArr[i]);
        }

        obj.close();
    }
}
