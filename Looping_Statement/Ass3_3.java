/*
 *Write a java program to find whether the given integer number in Buzz number or not. 
 *Buzz number is a number that ends with digit 7 or divisible by 7.
 *Example :  42 is a Buzz number because it is divisible by 7.
  *                 107 is a Buzz number because it ends with 7.
 */
package Looping_Statement;

import java.util.Scanner;

public class Ass3_3 {

    public static boolean isBuzzNum(int num) {
        if (num % 10 == 7 || num % 7 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        if (isBuzzNum(num)) {
            System.out.println("Yes, " + num + " is a buzz number.");
        } else {
            System.out.println("No, " + num + " is not a buzz number.");

        }
        input.close();
    }
}
