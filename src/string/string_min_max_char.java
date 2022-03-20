package string;

import java.util.Arrays;
import java.util.Scanner;

public class string_min_max_char {
    public static void main(String[] args) {
        String response;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the a response string : ");
        response = input.nextLine();
        int set = -1;
        char[] array = response.toCharArray();
        int[] check = new int[response.length()];
        for (int i = 0; i < response.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < response.length(); j++) {
                if (array[i] == array[j]) {
                    count++;
                    check[j] = set;
                }
                if (check[i] != set) {
                    check[i] = count;
                }
            }
            Arrays.sort(check);
            System.out.println("The max no. of ");
        }
    }
}
