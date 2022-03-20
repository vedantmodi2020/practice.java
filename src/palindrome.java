import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        int a, b, c = 0, d;
        System.out.println("Program to print find wether the given number is palindrome or not");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        d = a;
        while (a > 0) {
            b = a % 10;
            c = (c * 10) + b;
            a = a / 10;
        }
        if (d == c) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}
