package numbers;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        int x, y, z = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        x = input.nextInt();
        while (x > 0) {
            y = x % 10;
            z = (z * 10) + y;
            x = x / 10;
        }
        System.out.println("The reverse of the given numebr is :" + z);
    }
}
