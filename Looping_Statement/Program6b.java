/*Problem Statement:
 *Find the Prime numbers between given range.
 */
package Looping_Statement;

import java.util.Scanner;

public class Program6b {
     public static boolean primeNumber(int num) {
       
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;       
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower_bound = obj.nextInt();
        System.out.print("Enter the Upper bound: ");
        int upper_bound = obj.nextInt();

        System.out.print("Prime number between "+ lower_bound + " and " + upper_bound + " are: ");
       for(int i=lower_bound; i<=upper_bound; i++){
           if(primeNumber(i)){
            System.err.print(i + " ");
           }
       }
        obj.close();
    }
}
