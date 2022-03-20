package matrix;

import java.util.Scanner;

public class matrix_multiply {
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
        int[][] matrix_mult = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < columns; k++) {
                    matrix_mult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print("|" + matrix_mult[i][j]);
            }
            System.out.println();
        }
    }
}
