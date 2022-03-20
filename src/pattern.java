import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        int i, j, row;
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
