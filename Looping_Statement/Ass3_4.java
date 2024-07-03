/*Problem Statement:
 *Write a Java program to determine whether a given integer is a Duck number or not. A Duck number is a positive, non-zero number that contains at least one zero in it.
 *Example:
 *3210 is a Duck number because it contains a zero at the end of the number.
 *8237 is not a Duck number because it does not contain zero in it. 
 */

package Looping_Statement;

import java.util.Scanner;

public class Ass3_4 {

    public static boolean isDuck(int num) {
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) {
                return true;
            }
            num /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Invalid.....Please enter the positive non zero number.");
        } else {
            if (isDuck(num))
                System.out.println("yes, " + num + " is a Duck number.");
            else
                System.out.println("No, " + num + " is not a Duck number.");
        }
        input.close();
    }
}
