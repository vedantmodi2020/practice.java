package string;

import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        String response;
        System.out.println("Please enter a string : ");
        Scanner input = new Scanner(System.in);
        response = input.nextLine();
        int flag = 1;
        char[] array = response.toCharArray();
        for (int i = 0; i < response.length(); i++) {
            if (array[i] != array[response.length() - 1 - i]) {
                System.out.println("The given array is not a palindrome");
                flag = 0;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("The given string is palindrome");
        }

    }
}
