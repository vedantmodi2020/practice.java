package string;

import java.util.Scanner;

public class string_relace_char {
    public static void main(String[] args) {
        String response;
        System.out.println("Please enter a string : ");
        Scanner input = new Scanner(System.in);
        response = input.nextLine();
        String choice;
        System.out.println("Please enter the choice you want to replace the sapces with : ");
        choice = input.nextLine();
        System.out.println("The string with the given replacent is : " + response.replaceAll(" ", choice));

    }
}
