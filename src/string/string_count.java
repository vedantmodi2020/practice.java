package string;

import java.util.Scanner;

public class string_count {
    public static void main(String[] args) {
        String response;
        System.out.println("Please enter a string : ");
        Scanner input = new Scanner(System.in);
        response = input.nextLine();
        int count = 0;
        for (int i = 0; i < response.length(); i++) {
            if (response.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("The total no. of Character in the string is : " + count);
    }
}
