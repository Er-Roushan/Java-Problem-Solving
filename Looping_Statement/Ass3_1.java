/* Problem Statement:
 Write a Java program to determine whether a given integer number is a Sunny number.
 A number is called a sunny number if the number next to the given number is a perfect square. 
 In other words, a number N will be a sunny number if N+1 is a perfect square.
 Example :  N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.
 
 */
package Looping_Statement;
import java.util.Scanner;
public class Ass3_1 {

    public static boolean isSunnyNumber(int num){       
        double sq_root = Math.sqrt(num+1);
        return (sq_root - Math.floor(sq_root) == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        if(isSunnyNumber(num)){
            System.out.println("Yes entered number is Sunny number.");
        }else{
            System.out.println("No Entered number is not a Sunny number.");
        }
        input.close();
    }
}
