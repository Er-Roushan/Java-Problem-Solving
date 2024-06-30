package Looping_Statement;

import java.util.Scanner;

public class Program6a {

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();

        if (isPrime(num)) {
            System.out.println("Yes the given number is prime numbers");

        } else {
            System.out.println("NO the given number is not a prime number.");
        }
        obj.close();
    }
}
