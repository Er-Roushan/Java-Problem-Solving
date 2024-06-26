/* Problem Statement:
Find factor of a natural number.
 */
package Looping_Statement;

import java.util.Scanner;

public class Program5b {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();
        System.out.print("1"+ ", " );
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.print(num);
        obj.close();
    }
}
