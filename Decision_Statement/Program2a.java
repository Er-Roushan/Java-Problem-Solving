
/*Problem Statement:
 Largest among four number.
 */
package Decision_Statement;
import java.util.Scanner;

public class Program2a {
    public static void main(String[] args) {
        
        int num1, num2, num3, num4;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        num1 = obj.nextInt();
        System.out.print("Enter the number 2: ");
        num2 = obj.nextInt();
        System.out.print("Enter the number 3: ");
        num3 = obj.nextInt();
        System.out.print("Enter the number 4: ");
        num4 = obj.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println(num1 + " number is greater");
        } else if (num2 > num3 && num2 > num4) {
            System.out.println(num2 + " number is greatest");
        } else if (num3 > num4) {
            System.out.println(num3 + " number is greatest.");
        } else {
            System.out.println(num4 + " number is greatest.");
        }
        obj.close();
    }

}