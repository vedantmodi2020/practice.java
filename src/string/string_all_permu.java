package string;

import java.util.Scanner;

public class string_all_permu {
    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a reponse String : ");
        str = input.nextLine();
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, len);
    }

    public static void generatePermutation(String str, int start, int end) {
        // Prints the permutations
        if (start == end - 1)
            System.out.println(str);
        else {
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                generatePermutation(str, start + 1, end);
                str = swapString(str, start, i);
            }
        }
    }
}