package string;

import java.util.Scanner;

public class string_all_subset {
    public static void main(String[] args) {
        String response1;
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter the a response : ");
        response1 = input.nextLine();
        int len = response1.length();
        int all_subset = len * (len + 1) / 2;
        String[] array = new String[all_subset];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                array[temp] = response1.substring(i, j + 1);
                temp++;
            }

        }
        System.out.println("all the subsets of he given array is : ");
        for (int i = 0; i < all_subset; i++) {
            System.out.println(array[i]);
        }
    }
}
