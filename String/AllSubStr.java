package String;

import java.util.Scanner;

public class AllSubStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }

            // System.out.println("==");
        }

        input.close();
    }

}
