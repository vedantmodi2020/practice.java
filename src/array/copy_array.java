package array;

import java.util.Scanner;

public class copy_array {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        size = input.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[array1.length];
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println("The elements of the array1 are: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }

        System.out.println("\n");

        System.out.println("The elements of th array2 are: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
        // also can use clone method for copy the array
    }
}
