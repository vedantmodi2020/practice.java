package array;

import java.util.Scanner;

public class frequency_each {
    public static void main(String[] args) {
        int size;
        System.out.println("Please eneter the size of the array: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int[] check = new int[size];
        int set = -1;
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    check[j] = set;
                }

            }
            if (check[i] != set) {
                check[i] = count;
            }

        }
        System.out.println("----------------------------------------");
        System.out.println("Element | Frequency");
        for (int i = 0; i < size; i++) {
            if (check[i] != set) {
                System.out.println("   " + array[i] + "    |" + "   " + check[i] + "   ");
            }
        }

    }
}
