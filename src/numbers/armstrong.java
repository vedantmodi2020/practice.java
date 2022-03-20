package numbers;

import java.util.Scanner;

public class armstrong {
    static boolean isarms(int x) {
        int temp, digit = 0, last = 0, sum = 0;
        temp = x;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = x;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }
        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("The program to verify wether the gven number is armstrong or not\n");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (isarms(num)) {
            System.out.println("The number is Armsstrong number\n");
        } else {
            System.out.println("The number is not he Armstrong number\n");
        }
    }
}
