package class_objects;

import java.util.Scanner;

class Students // user defined data type
{
    // data members
    String name, address;

    // behaviour - action performed by the students with the system
    // defining behaviour using metods
    public void addprofileinf0() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Please enter your address: ");
        address = input.nextLine();

    }

    public void viewprofileinfo() {
        System.out.println(name);
        System.out.println(address);
    }
}

public class class_lecture2 {
    public static void main(String[] args) {
        Students[] array;
        array = new Students[10];
        for (int i = 0; i < 10; i++) {
            array[i] = new Students();
        }
        for (int i = 0; i < 10; i++) {
            array[i].addprofileinf0();
        }
        for (int i = 0; i < 10; i++) {
            array[i].viewprofileinfo();
        }

    }
}
