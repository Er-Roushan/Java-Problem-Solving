
/* Problem Statement:
A School follows a day wise time table for its students to play a specific game.

Time Table

Monday    : Basketball
Tuesday   : Tennis
Wednesday : Basketball
Thursday  : Cricket
Friday    : Tennis
Saturday  : Excercise
Sunday    : Holiday

Design a simple application which can read the day of the week and suggest to the student
which game he is supposed to play today by following the prescribed
time table designed by the school.
  
 */
package Decision_Statement;
import java.util.Scanner;

public class Program3b {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String str = obj.nextLine().toLowerCase();

        switch (str) {
            case "monday":
                // grouping of cases
            case "wednesday":
                System.out.println("Basketball");
                break;

            case "tuesday":
            case "friday":
                System.out.println("Tennis");
                break;

            case "thrusday":
                System.out.println("Cricket");
                break;
            case "saturday":
                System.out.println("Excercise");
                break;
            case "sunday":
                System.out.println("Holiday");
                break;

            default:
                System.out.println("invalid day");
                break;
        }
        obj.close();
    }
}
