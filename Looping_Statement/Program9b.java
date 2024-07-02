/* Problem Statement:
 * You are developing a biology learning application that introduces students to the concept of balance in numbers.
As part of an interactive quiz feature, you want to create a program that determines if a given number exhibits "Harmony."
Concept:
Harmonious Number: A positive integer N is classified as a Harmonious Number if the sum of its first and last digits equals 
the sum of its remaining digits.
Non-Harmonious Number: If the sum of the first and last digits does not equal the sum of the remaining digits, the number is 
classified as Non-Harmonious.
Example:
For input number 2468:
First digit and Last digit: 2,8
Remaining digits: 4, 6
Sum of first and last digits = 2 + 8 = 10
Sum of remaining digits = 4 + 6 = 10
Since the sum of first and last digits equals the sum of remaining digits, 2468 is a Harmonious Number.
Test Case 1: 
	Input  : 1235
	Output : Non-Harmony
Test Case 2: 
	Input  : 2468
	Output : Harmony
Test Case 3: 
	Input  : 9474
	Output : Non-Harmony
*/
package Looping_Statement;

import java.util.Scanner;

public class Program9b {

    public static boolean isHarmonic(int num) {
        // find the no of digit
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= count; i++) {
            int digit = num % 10;
            if (i == 1 || i == count) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }

            num /= 10;
        }

        if (sum1 == sum2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        if (isHarmonic(num)) {
            System.out.println("Harmonic");
        } else {
            System.out.println("Non-Harmonic");
        }
        input.close();
    }
}
