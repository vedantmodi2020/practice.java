package matrix;

import java.util.Scanner;

public class subtratct_matrix {
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
        int[][] matrix_sub = new int[rows][columns];
        System.out.println("Matrix 1 :");
        for (int k[] : matrix1) {
            for (int kk : k) {
                System.out.print("|" + kk);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("-");
        System.out.println("\n");
        System.out.println("Matrix 2: ");
        for (int k[] : matrix2) {
            for (int kk : k) {
                System.out.print("|" + kk);
            }
            System.out.println();
        }

        System.out.println("=");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix_sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        for (int k[] : matrix_sub) {
            for (int kk : k) {
                System.out.print("|" + kk);
            }
            System.out.println();
        }

    }
}
