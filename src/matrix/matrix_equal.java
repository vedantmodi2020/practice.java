package matrix;

import java.util.Scanner;

public class matrix_equal {
    public static void main(String[] args) {
        int rows, columns;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dimensions of the matrix :");
        rows = input.nextInt();
        columns = input.nextInt();
        int[][] matrix1 = new int[rows][columns];
        System.out.println("please enter the elements for the matrix1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        int[][] matrix2 = new int[rows][columns];
        System.out.println("please enter the elements for the matrix2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        boolean valid = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    valid = false;
                    System.out.println("Matrix are not equal");
                    break;
                } else {
                    valid = true;
                }
            }
        }
        if (valid == true) {
            System.out.println("The matrices are equal");
        }
    }
}
