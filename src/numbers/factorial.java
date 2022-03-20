package numbers;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int n1, n2, n3;
        System.out.println("The program to find the factorial of the given number");
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n3 = 1;
        for (n2 = 1; n2 <= n1; n2++) {
            n3 = n3 * n2;
        }
        System.out.println("The factorial of the " + n1 + "! is: " + n3);
    }
}
