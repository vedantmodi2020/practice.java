package numbers;

import java.util.Scanner;
import java.lang.Math;

public class primenumber {
    public static void main(String args[]) {
        int n1, n3 = 0;
        double n2;
        System.out.println("\nProgram to wehter the given prime number is prime or not\n");
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = Math.sqrt(n1);
        n2 = (int) n2;
        for (int i = 2; i <= n2; i++) {
            if (n1 % i == 0) {
                n3 = n3 + 1;

            }

        }
        if (n3 != 0) {
            System.out.println("The number is not prime");
        }

        else {
            System.out.println("The number is prime");
        }

    }
}
