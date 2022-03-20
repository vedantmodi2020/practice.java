package array;

import java.util.Scanner;

public class jagged_prime {
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
        int total = 0;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                int f = 0;
                for (int k = 2; k < jagged[i][j]; k++) {
                    if (jagged[i][j] % k == 0) {
                        f = 1;
                    }

                }
                if (f == 0 && jagged[i][j] != 1) {
                    total += 1;
                }
            }
        }
        System.out.println("The total number of prime number in the array is : " + total);
    }
}