package numbers;

import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        int num, rem;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check wether it is automorphic or not : ");
        num = input.nextInt();
        rem = (num * num) % 10;
        if (rem == num % 10) {
            System.out.println("The given number is automorphic number");
        } else {
            System.out.println("The given number is not automorphic number");
        }
    }
}
