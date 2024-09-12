package String;

import java.util.Scanner;
import java.util.Arrays;

public class StringAnagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        } else {
            // String str1_lc = str1.toLowerCase();
            // String str2_lc = str2.toLowerCase();

            String[] str1_arr = str1.trim().toLowerCase().split("");
            String[] str2_arr = str2.trim().toLowerCase().split("");
            Arrays.sort(str1_arr);
            Arrays.sort(str2_arr);

            for (int i = 0; i < str2_arr.length; i++) {
                if (!(str1_arr[i].equals(str2_arr[i]))) {
                    return false;
                }

            }

        }

        return true;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first String: ");
        String str1 = input.nextLine();
        System.out.print("Enter the Second String: ");
        String str2 = input.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Yes both string are anagram");
        } else {
            System.out.println("No both string are not anagram");
        }
        input.close();
    }

}
