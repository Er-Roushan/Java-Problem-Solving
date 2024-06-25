
/* Problem Statement:
The provided java program is a simple console-based application that prompts the user t
to enter a number between 1 to 7.

The program then uses a switch case statement to determine the corresponding day of the week based
on the user's input and print's the result.

Day 1: Sunday
Day 2: Monday
Day 3: Tuesday
Day 4: Wednesday
Day 5: Thursday
Day 6: Friday
Day 7: Saturday

 
 */
package Decision_Statement;
import java.util.Scanner;

public class Program4a {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number between 1 to 7: ");
        int day = obj.nextInt();
        

        switch(day) {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
        
            default:
                System.out.println("invalid input");
                break;
        }

        obj.close();
    }
}
