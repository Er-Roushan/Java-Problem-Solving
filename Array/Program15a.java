/*
 * Given an integer array nums and an integer val,remove all occurrences of val in nums in-place. 
The order of the elements may be changed. Then return the number of elements in nums which are not
 equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
The remaining elements of nums are not important as well as the size of nums.

Return k.

Test Case 1: 

	Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]

Test Case 2: 

	Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]


 */

package Array;

import java.util.*;

public class Program15a {

    public static int noOfElement(int[] arr, int val) {

        // by using another array
        /* 
        int[] temp_arr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                temp_arr[k++] = arr[i];
            }
        }
        */
        // trim temp_array
        // int[] trimed_arr = Arrays.copyOf(temp_arr, k);       

        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[j++] = arr[i];
            }
        }

        return j;
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

        System.out.print("Please enter the value which you want to remove: ");
        int val = obj.nextInt();
        System.out.println("No of Element is: " + noOfElement(arr, val));
        obj.close();
    }
}
