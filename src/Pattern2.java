import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int i, j, k = 1, row;
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}