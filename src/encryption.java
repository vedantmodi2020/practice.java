import java.util.Scanner;

public class encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string :");
        String choice;
        choice = input.nextLine();
        String enc = "";
        int deposition = 1;
        for (int i = 0; i < choice.length(); i++) {
            int value = choice.charAt(i);
            int d = deposition;
            if (value + deposition > 122) {
                deposition -= (122 - value);
                deposition = deposition % 26;
                enc += (char) (96 + deposition);
            } else {
                enc += (char) (value + deposition);
            }
            deposition = d;
        }
        System.out.println(enc);

    }
}
