package matrix;

import java.util.Scanner;

public class matrix_prime_odd_even_frq {
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
        int even = 0;
        int odd = 0;
        int prime = 0;
        for (int k[] : matrix1) {
            for (int kk : k) {
                int flag = 0;
                for (int mn = 2; mn < kk; mn++) {

                    if (kk % mn == 0 || kk == 1) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    prime += 1;
                }
                if (kk % 2 == 0) {
                    even += 1;
                }
                if (kk % 2 != 0) {
                    odd += 1;
                }

            }
        }
        System.out.println("The total number of even Numbers in the matrix is : " + even);
        System.out.println("The total number of odd numbers in the matrix is : " + odd);
        System.out.println("Th e total number of prime numbers in the matrix is : " + prime);
    }
}
