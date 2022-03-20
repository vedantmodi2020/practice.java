package numbers;

import java.util.Scanner;

public class sum_numbers {
    static int airthmeticsum(int r) {
        int sum = 0;
        for (int i = 0; i <= r; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int ran;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the range for the sum of the numebr ");
        ran = input.nextInt();
        System.out.println("the sum of the numbers upto " + ran + " is : " + airthmeticsum(ran));

    }
}
