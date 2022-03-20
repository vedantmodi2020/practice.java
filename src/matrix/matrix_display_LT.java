package matrix;

import java.util.Scanner;

public class matrix_display_LT {
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
        System.out.println("The original matrix is :");
        for (int k[] : matrix1) {
            for (int kk : k) {
                System.out.print("|" + kk);
            }
            System.out.println();
        }
        System.out.println("Lower triangular matrix for the given matrix is :");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                if (i < j) {
                    System.out.print("|0");
                } else {
                    System.out.print("|" + matrix1[i][j]);
                }
            }
            System.out.println();
        }
    }
}
