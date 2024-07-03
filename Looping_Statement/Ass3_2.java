/*
 * Write a Java program to determine whether a given integer number is a Tech number.
 * A number is called a tech number if the given number has an even number of digits and the number can be divided exactly into two parts from the middle.
 * After equally dividing the number, sum up the numbers and find the square of the sum. If we get the number itself as square, the given number is a tech number, else, not a tech number.
 * Example :   number = 2025 
  *                                = 20 + 25 
  *                                = (45)2
  *                                   2025 = 2025 
  *             Hence 2025 is a Tech number.
 */
package Looping_Statement;
import java.util.Scanner;
public class Ass3_2 {

    public static int noOfDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean isTechNum(int num, int digit_count) {

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
            if (isTechNum(num, no_of_digit)) {
                System.out.println("Tech Number");
            } else {
                System.out.println("No it is not a Tech number.");
            }
        }
        input.close();
    }
    
}
