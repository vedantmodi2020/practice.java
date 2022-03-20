package numbers;

import java.util.Scanner;

public class sunny {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check wether it is sunny or not : ");
        num = input.nextInt();
        double sqroot = Math.sqrt(num + 1);
        if (sqroot - Math.floor(sqroot) == 0) {
            System.out.println("The given number is the sunny number");

        } else {
            System.out.println("the given number is not the sunny number");
        }
    }
}
