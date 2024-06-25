
/* Problem Statement:
For an Ecommerce application we need to write a logic to calculate the total price of the purchase after
applying the discount. The Discount are as follows,

If the customer is a teenager, flat discount 5%. if the total purchase price is above 5000 after the flat
discount customer gets additional 5% dicount.

If the customer is in 20's, flat discount 6%. if the total purchase price is above 4000 after the flat
discount customer gets additional 6% dicount. 

if the customer is aged above 29 flat discount 15%.

Assume the age and total purchase price is given as input.

Write a program to calculate the total price of purchase after discount and display, total price before
discount, total price after discount, discounted amount if any.
 
 */
package Decision_Statement;
import java.util.Scanner;

public class Program4b {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age;
        double total_amount;
        System.out.print("Enter Your age: ");
        age = obj.nextInt();
        System.out.print("Enter the total amount: ");
        total_amount = obj.nextDouble();

        double amt_after_discount = total_amount;

        if (age >= 13 && age <= 19) {
            amt_after_discount = (total_amount - (0.05 * total_amount));
            
            if (amt_after_discount > 5000) {
                amt_after_discount = (amt_after_discount - (0.05 * amt_after_discount));
            }

        } else if (age >= 20 && age <= 29) {
            amt_after_discount = (total_amount - (0.06 * total_amount));
            
            if (amt_after_discount > 4000) {
                amt_after_discount = (amt_after_discount - (0.06 * amt_after_discount));
            }

        } else if (age > 29) {
            amt_after_discount = (total_amount - (0.15 * total_amount));          

        } else {
            System.out.println("No Discount for you.");
        }

        System.out.println("Total price before discount: " + total_amount);
        System.out.println("Total price after discount: " + amt_after_discount);
        System.out.println("Discounted amount: " + (total_amount - amt_after_discount));

        obj.close();
    }
}
