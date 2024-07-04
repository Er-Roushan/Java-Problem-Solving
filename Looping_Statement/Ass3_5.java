/*
 * Write a Java program to determine whether a given number is a fascinating number. 
 * A number is said to be fascinating if, after multiplying it by 2 and 3 separately and concatenating the results with the original number,
 * the resultant number contains all the digits from 1 to 9 exactly once.
 *          For example, consider the number 327:
*           327 × 2 = 654
*           327 × 3 = 981
*            Concatenating these results with the original number gives:
*           "327" + "654" + "981" = "327654981".
*            This resultant number contains all the digits from 1 to 9 exactly once, making 327 a fascinating number.

            (192, 219, 273, 327, 1902, 1920, 2019) --> Test Cases
 */
package Looping_Statement;

import java.util.Scanner;

public class Ass3_5 {

    public static boolean isFascinating(int num) {
        int twice = num * 2;
        int thrice = num * 3;
        String str = String.valueOf(num) + String.valueOf(twice) + String.valueOf(thrice);
        long final_val = Long.parseLong(str);

        int[] arr = new int[10];

        while (final_val != 0) {
            int digit = (int) (final_val % 10);
            arr[digit] += 1;
            final_val /= 10;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = input.nextInt();
        if (num < 100) {
            System.out.println("Number of digit should be greater than 2");
        } else {
            if (isFascinating(num)) {
                System.out.println("Yes " + num + " is a fascinating number.");
            } else {
                System.out.println("No " + num + " is not a fascinating number.");
            }
        }
        input.close();
    }

}
