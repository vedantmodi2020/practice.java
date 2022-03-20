package array;

import java.util.Scanner;

public class jagged_array_sum {
    public static void main(String[] args) {
        int rows;
        System.out.println("Please enter the number row of the jagged array");
        Scanner input = new Scanner(System.in);
        rows = input.nextInt();

        int[][] jagged = new int[rows][];
        System.out.println("please enter the elements of the jagged array");
        for (int i = 0; i < rows; i++) {
            System.out.println("please enter the size of column of the jagged array");
            int column = input.nextInt();
            System.out.println("please enter the elements of the jagged array");
            for (int j = 0; j < column; j++) {
                jagged[i] = new int[] { input.nextInt() };
            }
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                sum += jagged[i][j];
            }
        }
        System.out.println("The sum of all the elements of the array is : " + sum);
    }
}
