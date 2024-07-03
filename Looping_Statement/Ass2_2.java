/* Problem Statement:
Write a Java program to check whether the sum of the digits of a given number is equal to the product of the digits of the number.
       Description : 
              Input : 1124
              Output :  true
 */
package Looping_Statement;

import java.util.Scanner;

public class Ass2_2 {

    public static void myFunc(int num) {
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        if (sum == product) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int num = input.nextInt();
        myFunc(num);
        input.close();
    }
}
