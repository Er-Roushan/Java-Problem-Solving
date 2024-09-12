package String;

import java.util.Scanner;

public class StrPallindrome {

    public static boolean PallindromeCheck(String new_String) {
        for (int i = 0, j = new_String.length() - 1; j > i; i++, j--) {

            if (new_String.charAt(i) != new_String.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String org_str = input.nextLine();

        String new_String = org_str.toLowerCase();

        if (PallindromeCheck(new_String)) {
            System.out.println("Yes String is pallindrome.");
        } else {
            System.out.println("No String is not pallindrome.");
        }

        input.close();
    }
}
