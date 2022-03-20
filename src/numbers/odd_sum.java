package numbers;

import java.util.Scanner;

public class odd_sum {
    public static void main(String[] args) {
        int sum = 0, n;
        System.out.println("Please enter only odd numbers upto ur choice n");
        System.out.println("Please enetr your choice");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x;
            x = input.nextInt();
            if (x % 2 != 0) {
                sum += x;
            }

            else {
                while (x % 2 != 0) {

                    System.out.println("Please enter a even number");
                    x = input.nextInt();
                }
                sum += x;
            }

        }
        System.out.println("The total SUM is :" + sum);
    }
}
