/* Problem Statement: 
 Factorial of a number.
 */
package Looping_Statement;

import java.util.Scanner;

public class Program5a {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = obj.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("factorial of " + num + " is: " + fact);
        obj.close();
    }
}
