package array;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        size = input.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = array1[size - 1 - i];
        }
        System.out.println("The original array elements order is this :");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
        System.out.println("The reverse of the above array will be this :");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
    }
}
