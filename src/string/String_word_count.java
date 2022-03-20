package string;

// Java Program to Sort Names in an Alphabetical Order
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main(String[] args)
	{
		
		int num;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter total number of names :");
        num = input.nextInt();
		
		
		String names[] = new String[num];
        for(int i=0;i<num;i++)
        {
            names[i] = input.nextLine();
        }
		
		String temp;
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				
				if (names[i].compareTo(names[j]) > 0) {
					// swapping
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		
		System.out.println(
			"The names in alphabetical order are: ");
		for (int i = 0; i < num; i++) {
			System.out.println(names[i]);
		}
	}
}

