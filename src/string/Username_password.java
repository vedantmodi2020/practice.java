package string;

import java.util.Scanner;


public class Username_password {
    public static void main(String[] args) {
        String user_name, password, conf_pass;
        boolean valid = true;
        System.out.println("please enter the Username for your account");
        Scanner input = new Scanner(System.in);
        user_name = input.nextLine();
        do {
            if (user_name.isEmpty()) {
                System.out.println("Please enter the something in the username");
                user_name = input.nextLine();
                valid = false;
            } else {
                valid = true;
            }
        } while (valid == false);
        System.out.println("please enter the Password for your account");
        password = input.nextLine();
        do {
            if (password.isEmpty()) {
                System.out.println("Please enter something in the password");
                valid = false;
                password = input.nextLine();
            } else if (password.length() < 8) {
                System.out.println("Please enter the password with length greater or equal to 8");
                valid = false;
                password = input.nextLine();
            } else if (password.contains(user_name)) {
                valid = false;
                System.out.println("Please don't enter the username as your password enter again");
                password = input.nextLine();
            } else {
                valid = true;
            }

        } while (valid == false);
        System.out.println("please enter the password again to confirm");
        conf_pass = input.nextLine();
        int trys = 5;
        do {
            trys = trys - 1;
            if (conf_pass.equals(password)) {
                System.out.println("Congrats your account is created");
                valid = true;
                break;
            } else if (conf_pass.isEmpty()) {
                System.out.println("Please enter something only " + trys + " tries left");
                valid = false;
                conf_pass = input.nextLine();
            } else if (!conf_pass.equals(password)) {
                System.out.println("Please enter the password again only " + trys + " tries left");
                valid = false;
                conf_pass = input.nextLine();
            }

        } while (trys > 0 && valid == false);
        if (valid == false) {
            System.out.println("Tries limit exceeded please try again in next life thank you !!");
        }
    }
}