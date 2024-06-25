
/* Problem statement:
 Suppose you Want to create a program that greets the user based on the time of the day.
 Implement a program that takes the current hour as input and outputs a greeting message accordingly.
 
 Note: Take the time in 24-Hour format

 5 to 11  :"Good Morning"
 12 to 16 :"Good Afternoon"
 17 to 20 :"Good Evening"
 21 to 4  :"Good Night"
 
 */
package Decision_Statement;
import java.util.Scanner;

public class Program2b {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int time;

        System.out.print("Enter the current time: ");
        time = obj.nextInt();

        if (time < 0 || time > 24) {
            System.out.println("Enterd time is invalid.");
        } else if (time >= 5 && time <= 11) {
            System.out.println("Good Morning");
        } else if (time >= 12 && time <= 16) {
            System.out.println("Good AfterNoon");
        } else if (time >= 17 && time <= 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
        obj.close();
    }
}
