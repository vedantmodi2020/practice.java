package matrix;

import java.util.Scanner;

public class identify_matrix {
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
        boolean flag = true;
        if (rows != columns) {
            System.out.println("Please enter the a square matrix ");

        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (i == j && matrix[i][j] != 1) {
                        flag = false;
                        break;
                    }
                    if (i != j && matrix[i][j] != 0) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if (flag)
            System.out.println("Given matrix is an identity matrix");
        else
            System.out.println("Given matrix is not an identity matrix");

    }
}
