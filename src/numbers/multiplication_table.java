package numbers;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        int num, i, mult;
        System.out.println("The program to print the multiplication table for the given input\n");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (i = 1; i <= 10; i++) {
            mult = num * i;
            System.out.println(num + " * " + i + " = " + mult);
        }
    }
}
