package string;

import java.util.Scanner;

public class String_sort {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        String response;
        System.out.println("please enter the number of names you want to enter");
        
        num = input.nextInt();
        String array[] = new String[num];
        for(int i=0; i<num+1;i++)
        {
            response = input.nextLine();
            array[i]=response;
        }
        String temp;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if (array[j].compareTo(array[j + 1]) > 0)
                {
                    temp = array[j];
                array[j]= array[j+1];
                array[j+1]=temp;
                }
            }
        }
        for(String k:array)
        {
            System.out.println(k);
        }
    }
}
