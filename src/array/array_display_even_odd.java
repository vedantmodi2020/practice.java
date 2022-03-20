package array;

import java.util.Scanner;

public class array_display_even_odd {
    public static void main(String[] args) {
        int size;
        System.out.println("Please eneter the size of the array: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Please eneter the elements of the array");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int choice, x;
        do {
            System.out.println("Menu:-");
            System.out.println("1. Display the array");
            System.out.println("2. Display the even located elemnts in the array");
            System.out.println("3. Display the odd located elements in the array");
            System.out.println("4. Exit");
            System.out.println("\n Please neter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    for (int i = 0; i < size; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                }
                case 2: {
                    for (int i = 1; i < size; i = i + 2) {
                        System.out.println(array[i]);
                    }
                    break;

                }
                case 3: {
                    for (int i = 0; i < size; i = i + 2) {
                        System.out.println(array[i]);
                    }
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.println("Please enter the number within the given range");
                    break;
                }
            }
        } while (choice != 4);
    }
}
