package matrix;

import java.util.Scanner;

public class sum_rows_columns {
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

        for (int i = 0; i < rows; i++) {
            int row_sum = 0;
            for (int j = 0; j < columns; j++) {
                row_sum += matrix[i][j];
            }
            System.out.println("The sum of the row " + (i + 1) + " is: " + row_sum);
        }
        for (int i = 0; i < columns; i++) {
            int col_sum = 0;
            for (int j = 0; j < rows; j++) {
                col_sum += matrix[j][i];
            }
            System.out.println("The sum of the column " + (i + 1) + " is: " + col_sum);
        }
    }
}
