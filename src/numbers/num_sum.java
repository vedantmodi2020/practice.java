package numbers;

import java.util.Scanner;

public class num_sum {
    public static void main(String[] args) {
        int n, i, sum = 0;
        System.out.println("The program to print the airthmetic sum upto n\n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers upto n is :" + sum);

    }
}
