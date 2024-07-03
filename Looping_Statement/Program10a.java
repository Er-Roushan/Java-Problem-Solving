/* Problem Statement:
 * Design a Java program that checks if a given number is a "Symmetric Power Number." 
A Symmetric Power Number is defined as a positive integer with an even number of digits that can be divided exactly into two equal parts from the middle. When these two parts are summed and the result is squared, it should equal the original number itself.
Write the Java program to implement this concept. Ensure that the program:
Prompts the user to enter a positive integer.
Determines if the entered number qualifies as a Symmetric Power Number based on the described criteria.
Prints whether the number is a Symmetric Power Number or not.
Example:
Input :2025 
After the split of the number in 2 half and addition the Sum is 45 and Square of it is 2025
Output :"Symmetric Power Number."
Test Case 1: 
	Input  : 2025
	Output : "Symmetric Power Number."
Test Case 2: 
	Input  : 2468
	Output :  "Not-Symmetric Power Number."
Test Case 3: 
	Input  : 13123
	Output : "Invalid Number”
*/
package Looping_Statement;

import java.util.Scanner;

public class Program10a {

    public static int noOfDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean isSymmetricPowerNum(int num, int digit_count) {

        int divisor = 10;
        for (int i = 1; i < digit_count / 2; i++) {
            divisor *= divisor;
        }
        int half_part1 = num % divisor;
        int half_part2 = num / divisor;
        int sum = half_part1 + half_part2;
        sum *= sum;
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int num = input.nextInt();

        if (num < 0)
            System.out.println("Please enter only positive number.");

        int no_of_digit = noOfDigit(num);

        if (no_of_digit % 2 != 0) {
            System.out.println("Invalid Number.");
        } else {
            if (isSymmetricPowerNum(num, no_of_digit)) {
                System.out.println("Symmetric power number");
            } else {
                System.out.println("Not-Symmetric power number");
            }
        }
        input.close();
    }
}
