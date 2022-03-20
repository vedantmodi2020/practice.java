package class_objects;

import java.util.Scanner;

public class class_lecture1 {
    public static void main(String[] args) {
        // method one of defining the object
        Students Vedant = new Students();
        Vedant.addprofileinf0();
        Vedant.viewprofileinfo();
        Students vedant = new Students();
        // array of objects in java

    }
}

// anything thst has a unique id and many instances
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
