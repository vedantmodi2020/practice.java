package numbers;

import java.util.Scanner;

public class even_odd_prime {

    public static void main(String[] args) {
        int i, num, even = 0, odd = 0, prime = 0, rem;
        System.out.println("to identify the numbers of odd even and prime in a digit\n");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while (num > 0) {
            rem = num % 10;
            num = num / 10;

            if (rem % 2 == 0) {
                even += 1;
            } else if (rem % 2 != 0) {
                odd += 1;
            }

            int f = 0;
            for (int j = 2; j < rem; j++) {
                if (rem % j == 0) {
                    f = 1;
                }

            }
            if (f == 0 && rem != 1) {
                prime += 1;
            }
        }
        System.out.println("The total number of even numbers is : " + even + "\n");
        System.out.println("The total number of odd numbers is : " + odd + "\n");
        System.out.println("The total number of prime numbers is : " + prime + "\n");
    }
}
