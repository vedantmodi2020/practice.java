package numbers;

import java.util.Scanner;

public class peterson {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int num, sum = 0, rem, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check wether it is peterson or not : ");
        num = input.nextInt();
        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            sum += factorial(rem);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("The given number is the peterson number");
        } else {
            System.out.println("The given number is not the peterson number");
        }

    }
}
