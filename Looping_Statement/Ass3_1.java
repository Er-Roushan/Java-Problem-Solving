package Looping_Statement;
import java.util.Scanner;
public class Ass3_1 {

    public static boolean isSunnyNumber(int num){       
        double sq_root = Math.sqrt(num+1);
        return (sq_root - Math.floor(sq_root) == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        if(isSunnyNumber(num)){
            System.out.println("Yes entered number is Sunny number.");
        }else{
            System.out.println("No Entered number is not a Sunny number.");
        }
        input.close();
    }
}
