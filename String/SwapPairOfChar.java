package String;

import java.util.Scanner;

public class SwapPairOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = input.nextLine();

        String str_mod = str.trim();

        String[] str_arr = str_mod.split("");
        String temp;
        for (int i = 0; i < str_arr.length - 2; i = i + 2) {
            temp = str_arr[i];
            str_arr[i] = str_arr[i + 1];
            str_arr[i + 1] = temp;
        }

        System.out.println("Given String: " + str_mod);
        System.out.println("Modified String: " + String.join("", str_arr));

        input.close();

    }
}
