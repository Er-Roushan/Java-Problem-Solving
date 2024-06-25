
/* Problem Statement:
Suppose you have a temperature sensor in a room, and you want to determine the current temperature reading falls within an 
acceptable range for the room comfort.

You have predefined lower and upper bounds for the acceptable temperature range ( eg, lower bound = 70 f an upper bound = 80 f)
You have to write a program to read the current temp value in celsius(in this case, 25 C) and convert it into fahrenheit, print the temp in fahrenheit,
then check if it falls within the specified range. if it does, the program prints "Temperature is within the range".
 */
package Decision_Statement;
import java.util.Scanner;

public class Program2c {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int temp;
        System.out.print("Enter temp in Celsius: ");
        temp = obj.nextInt();

        double fahrenheit;
        fahrenheit = (temp * 9.0 / 5) + 32;
        if (fahrenheit >= 70 && fahrenheit <= 80) {
            System.out.println(fahrenheit + "Temperature is within the range");
        } else {
            System.out.println("Temp is not in given range");
        }

        obj.close();
    }
}
