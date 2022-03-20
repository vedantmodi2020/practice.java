package string;

import java.util.Scanner;

public class string_vovel_consonants {
    public static void main(String[] args) {
        String response;
        int vovel = 0, consonants = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the a response string : ");
        response = input.nextLine();
        for (int i = 0; i < response.length(); i++) {
            if (response.charAt(i) == 'a' || response.charAt(i) == 'e' || response.charAt(i) == 'i'
                    || response.charAt(i) == 'o' || response.charAt(i) == 'u') {
                vovel++;
            } else {
                consonants++;
            }
        }
        System.out.println("the total no. of vovel present in the string is : " + vovel);
        System.out.println("The total no. of the consonents present in the string is : " + consonants);
    }
}
