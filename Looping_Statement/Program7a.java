/*
Write a program to find the reverse of a given number 
and check whether the given number is palindrome or not.

Description:

A palindrome is a word, sentence, verse, or even number 
that reads the same backward or forward.

Input : 12321
Reverse of the given number: 12321
The input and reverse number are same so it's called Palindrome

Test Case 1: 
	Input : 8767 
	Output : false

Test Case 2: 
	Input : 985589
	Output : true

Test Case 3: 
	Input : 65298
	Output : false
*/
package Looping_Statement;

import java.util.Scanner;

public class Program7a {
	public static void isPallindrome(int revnum, int num) {
		if (revnum == num) {
			// System.out.println("Yes the entered number is also a pallindrome number.");
			System.out.println("True");
		} else {
			// System.out.println("No the entered number is not a pallindrome number.");
			System.out.println("false");
		}
	}

	public static void isReverse(int num) {
		int rev = 0;
		int temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp /= 10;
		}

		// System.out.println("The reverse of " + num + " is " + rev);
		isPallindrome(rev, num);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Please the enter a number: ");
		int num = obj.nextInt();
		isReverse(num);
		obj.close();
	}
}