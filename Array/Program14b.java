/*
 * remove duplicates from the sorted array sorted in ascending order.
 */
package Array;

import java.util.*;

public class Program14b {
    
    //Method to remove duplicates and trim the array containing the unique value
    public static int[] removeDuplicates(int[] arr) {
        int[] newArray = new int[arr.length];

        int j = 0;
        newArray[j] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= newArray[j]) {
                continue;
            } else {
                newArray[++j] = arr[i];
            }
        }
       
        //triming of array
        int[] b=Arrays.copyOf(newArray, j+1);
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

        int[] returnArr = removeDuplicates(arr);
        for (int i = 0; i < returnArr.length; i++) {
            System.out.println(returnArr[i]);
        }
        obj.close();
    }
}
