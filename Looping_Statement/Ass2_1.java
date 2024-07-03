/* Problem Statement:
Write a Java program to Find the sum and product of each 
digit of the given integer number .
Description : 
        Input : 7645
        Output :    
        Sum : 22
        Product  :  840
*/

package Looping_Statement;

import java.util.Scanner;

public class Ass2_1 {

    public static void sumAndProductOfDigit(int num) {
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        sumAndProductOfDigit(num);
        input.close();
    }
}
