/*Problem Statement:
 * To create an array:
 *      case1: create an array using declare and initialization statement.
 *      case2: create an array using new without initialization statement.
 *      case3: create an array using new and initialization statement.
 */
package Array;
import java.util.Scanner;
public class Program11a {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr1 = {23, 45,67,89}; ///declare and initialization
        int[] arr2 = new int[5]; //Declared using new without initialization

        for(int i=0; i<arr2.length; i++){
            System.out.print("Please enter the "+ (i+1) + " value:");
            arr2[i] = obj.nextInt();  //initialising the value
        }
        obj.close();
    }
}
