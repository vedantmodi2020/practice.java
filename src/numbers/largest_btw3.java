package numbers;

import java.util.Scanner;

public class largest_btw3 {
    public static void main(String[] args) {
        int a, b, c, largest, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enetr the tree numbers : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        System.out.println("The largest between the three number is :" + largest);
    }
}
