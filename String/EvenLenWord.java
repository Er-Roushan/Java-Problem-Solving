package String;

import java.util.Scanner;

public class EvenLenWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Please enter the sentence: ");
        String sentence = input.nextLine();

        // to convert string into array

        String[] str_arr = sentence.split(" ");

        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].length() % 2 == 0) {
                System.out.println(str_arr[i]);
            }
        }

        input.close();

    }
}
