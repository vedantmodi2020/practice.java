package string;

import java.util.Scanner;

public class string_rotation {
    public static void main(String[] args) {
        String response;
        int vovel = 0, consonants = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the a response 1 string : ");
        response = input.nextLine();
        String response1;
        System.out.println("please enter the a response 2 string : ");
        response1 = input.nextLine();
        String con = response + response;
        if (con.contains(response1)) {
            System.out.println("the given string is the rotation of the first string");
        } else {
            System.out.println("the given string is not the rotation of the first string");
        }
    }
}
