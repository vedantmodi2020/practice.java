package array;

import java.util.Scanner;

import javax.swing.Painter;

public class network {
    public static void main(String[] args) {
        int count = 0;
        String data;
        int i, parity;
        Scanner input = new Scanner(System.in);
        System.out.println("Give your data: ");
        data = input.nextLine();
        System.out.println("\n Prefer your Parity: 0:Even \t 1:Odd \t:");
        parity = input.nextInt();
        for (i = 0; i < 1; i++) {
            if (data.charAt(i) == 1) {
                count++;
            }
        }
        if (parity == 0 && count % 2 == 0) {
            System.out.println("No error detected");
        } else if (parity == 1 && count % 2 == 1) {
            System.out.println("No error detected");
        } else {
            System.out.println("Error detected");
        }

    }
}
