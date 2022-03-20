package array;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int size;
        System.out.println("Please eneter the size of the array: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("the odd number present in the array is : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("the even number present in the array is : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
