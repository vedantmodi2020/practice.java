package array;

import java.util.Scanner;

public class unique_elements_sort_array {

    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

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
        int length = array1.length;
        length = removeDuplicateElements(array1, length);
        System.out.println("The elements of the sorted array1  and with unique elements are this : ");
        for (int i = 0; i < length; i++) {
            System.out.println(array1[i] + " ");
        }

    }
}
