
/* Problem Statement:
 Write a program that takes three inputs from the user and checks how many of these inputs are even,
 Depending on the no of even inputs, the program should perform the different operations:

 1. if only one input is even, the program shoud print the even number.
 2. if two inputs are even, the program should print the sum of the two even numbers.
 3. if three inputs are even, the program shoud print the product of all three numbers.
 4. if no input is even, the program should print 0.
 */
package Decision_Statement;
import java.util.Scanner;

public class Program3a {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int inp1, inp2, inp3;
        System.out.print("Enter the no 1: ");
        inp1 = obj.nextInt();
        System.out.print("Enter the no 2: ");
        inp2 = obj.nextInt();
        System.out.print("Enter the no 3: ");
        inp3 = obj.nextInt();

        int count = 0;

        if (inp1 % 2 == 0) {
            count++;
        }
        if (inp2 % 2 == 0) {
            count++;
        }
        if (inp3 % 2 == 0) {
            count++;
        }

        switch (count) {

            case 1:
                if (inp1 % 2 == 0) {
                    System.out.println(inp1);
                }
                else if (inp2 % 2 == 0) {
                    System.out.println(inp2);
                }
                else {
                    System.out.println(inp3);
                }
                
                break;
            case 2:
                int sum = 0;
                if (inp1 % 2 == 0) {
                    sum = +inp1;
                }
                if (inp2 % 2 == 0) {
                    sum += inp2;
                }
                if (inp3 % 2 == 0) {
                    sum += inp3;
                }
                System.out.println("sum: " + sum);
                break;
            case 3:
                System.out.println(inp1 * inp2 * inp3);
                break;
            default:
                System.out.println("0");
                break;
        }
        obj.close();
    }
}
