package array;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        size = input.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        int flag = 0;
        System.out.println("Please enetr the number you want to search: ");
        int choice = input.nextInt();
        for (int element : array1) {
            if (element == choice) {
                flag = 1;
                System.out.println("The number is found in the array");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The number does'nt found in the array");
        }
    }
}
