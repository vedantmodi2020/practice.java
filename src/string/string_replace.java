package string;

import java.util.Scanner;

public class string_replace {
    public static void main(String[] args) {
        String response;
        System.out.println("Please enter a string : ");
        Scanner input = new Scanner(System.in);
        response = input.nextLine();
        String response1 = response.replaceAll(" ", "");
        System.out.println("the String without spaces is like this :  " + response1);
    }
}
