package numbers;

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers :");
        int num = 0;
        for (int i = 0; i <= 5; i++) {
            num = input.nextInt();
            int flag = 0;
            for (int j = 2; j < num / 2; j++) {
                if (num % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 && num != 1) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("The prime number is : " + num);

    }
}