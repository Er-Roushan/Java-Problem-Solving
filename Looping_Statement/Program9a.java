/*Problem Statement:
 * 
You are developing a math learning application that includes a feature to help students identify and understand special numbers.
A special number is defined as a positive integer with m digits, that equals the sum of its digits, each raised to the power of m.
To determine if a number is special:
Calculate the number of digits m.
Compute the sum of each digit raised to the power of m.
Check if this sum equals the original number.
Explanation:
Number: 153
It has 3 digits (m=3)
Sum of Digits Raised to the Power of m:
=1^3+5^3+3^3
=1+125+27=>153
=153=153
 */

package Looping_Statement;

import java.util.Scanner;

public class Program9a {

    public static boolean isArmStrong(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int digit_power = digit;
            for (int i = 1; i < count; i++) {
                digit_power *= digit;
            }
            // sum +=digit_power;
            sum += digit_power;
            temp /= 10;
        }

        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the num: ");
        int num = input.nextInt();

        if(num<0){
            System.out.println("invalid num");
        }
         else if (isArmStrong(num)) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a special number");
        }
        
        input.close();
    }
}
