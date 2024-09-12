package String;

import java.util.Scanner;

public class StringInsertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence/word: ");
        String str = input.nextLine();

        System.out.print("Enter the String you want to insert: ");
        String ins_substr = input.nextLine();

        int range = str.length();
        System.out.print("Enter the index value between 0 and " + range + " :");
        int index = input.nextInt();

        // String start_substr = str.substring(0, index + 1);
        // String end_substr = str.substring(5);

        // String final_Str = start_substr.concat(ins_substr).concat(end_substr);
        // System.out.println("final String: " + final_Str);

        System.out.println(str.substring(0, index + 1).concat(ins_substr).concat(str.substring(index + 1)));
        // System.out.println(start_substr);
        // System.out.println(end_substr);

        input.close();
    }

}
