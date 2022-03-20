package string;

import java.util.Arrays;
import java.util.Scanner;


public class string_aagram {
    public static void main(String[] args) {
        String response1, response2;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the response 1 : ");
        response1 = input.nextLine();
        System.out.println("please enter the response 2 : ");
        response2 = input.nextLine();
        response1 = response1.toLowerCase();
        response2 = response2.toLowerCase();
        int flag = 0;
        if (response1.length() == response2.length()) {
            char[] res1 = response1.toCharArray();
            char[] res2 = response2.toCharArray();
            Arrays.sort(res1);
            Arrays.sort(res2);
            for (int i = 0; i < response1.length(); i++) {
                if (res1[i] != res2[i]) {
                    flag = 2;
                    break;
                } else {
                    flag = 3;
                }
            }
        } else {
            System.out.println("The two given strings are not anagram ");
        }
        ;

        if (flag == 3) {
            System.out.println("The two given strings are anagram ");

        } else if (flag == 2) {
            System.out.println("The two given strings are not anagram ");

        }

    }
}
