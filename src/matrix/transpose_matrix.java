package matrix;

import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        int rows, columns;
        System.out.println("Please eneter the dimension for the matrix: ");
        Scanner input = new Scanner(System.in);
        rows = input.nextInt();
        columns = input.nextInt();
        System.out.println("please enter the elements of the matrix");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[][] transpose = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Original Matrix: ");
        for (int k[] : matrix) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for (int k[] : transpose) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }

    }
}
