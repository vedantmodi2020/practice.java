package array;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        int size, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        size = input.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array1[j - 1] > array1[j]) {
                    temp = array1[j - 1];
                    array1[j - 1] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println("The elements of the sorted array1 are this : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
    }
}