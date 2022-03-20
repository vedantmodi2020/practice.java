package class_objects;

import java.util.Scanner;

public class constructors {
    public static void main(String[] args) {
        // mehods that are invoked to initialize the data members for an object
        Students vedant = new Students("vedant","pune");
        Scanner input = new Scanner(System.in);
        System.out.println(vedant.name);
        System.out.println(vedant.address);

    }

}

class Students // user defined data type
{
    // data members
    String name;
    String address;

    public Students(String a,String b) {
        this.name = "test";
        this.address = "v";
    }
    

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