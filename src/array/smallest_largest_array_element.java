package array;

import java.util.Scanner;

public class smallest_largest_array_element {
    public static void main(String[] args) {
        int size;
        System.out.println("Please eneter the size of the array: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int temp;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The largest elemnet in the array is : " + array[size - 1]);
        System.out.println("The Smallest elemnet in the array is : " + array[0]);
    }
}
