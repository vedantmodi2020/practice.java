package matrix;

import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dimensions of the array : ");
        m = input.nextInt();
        n = input.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextInt();
            }
        }
        for (int k[] : array) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
}
