package string;

import java.util.Scanner;

public class string_lower_upper {
    public static void main(String[] args) {
        String response;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the response : ");
        response = input.nextLine();
        int choice;
        System.out.println("Enter 1 for upper case conversion and 0 for lower case conversion: ");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("The uppercase conversion for the given string is : " + response.toUpperCase());
        } else if (choice == 0) {
            System.out.println("The lowercase conversion for the given string is : " + response.toLowerCase());
        }
    }
}
