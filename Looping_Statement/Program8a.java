/* 
  
*/
package Looping_Statement;

import java.util.Scanner;

public class Program8a {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please Enter the No: ");
        int num = obj.nextInt();

        int digit;
        int largest_digit = num % 10;  //last digit
        num /= 10;
        while (num != 0) {
            digit = num % 10;
            if (digit > largest_digit) {
                largest_digit = digit;
            }
            num /= 10;
        }
        System.out.println("Largest digit is: " + largest_digit);
        obj.close();
    }

}
