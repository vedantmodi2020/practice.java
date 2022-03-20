package matrix;

import java.util.Scanner;

public class sum_matrix {
    public static void main(String[] args) {
        int rows, columns;
        System.out.println("Please eneter the dimension for the matrix: ");
        Scanner input = new Scanner(System.in);
        rows = input.nextInt();
        columns = input.nextInt();
        System.out.println("please enter the elements of the matrix");
        int[][] matrix1 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        int rows1, columns1;
        System.out.println("Please eneter the dimension for the matrix: ");
        rows1 = input.nextInt();
        columns1 = input.nextInt();
        System.out.println("please enter the elements of the matrix");
        int[][] matrix2 = new int[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        int[][] new_add = new int[rows][columns];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                new_add[i][j] = matrix2[i][j] + matrix1[i][j];
            }
        }
        System.out.println("Matrix1:");
        for (int k[] : matrix1) {
            for (int mn : k) {
                System.out.print(" |" + mn);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("+");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Matrix2:");
        for (int k[] : matrix2) {
            for (int mn : k) {
                System.out.print("|" + mn);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Addition of the two matrix: ");
        for (int k[] : new_add) {
            for (int mn : k) {
                System.out.print(" |" + mn);
            }
            System.out.println();
        }
    }
}
