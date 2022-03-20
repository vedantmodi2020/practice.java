package class_objects;

import java.util.Scanner;

//sorting using namefield

class Students // user defined data type
{
    // data members
    public String name, address, regno;

    // behaviour - action performed by the students with the system
    // defining behaviour using metods
    public void addprofileinfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Please enter your address: ");
        address = input.nextLine();
        System.out.println("Please enter your RegNO.: ");
        regno = input.nextLine();

    }

    public void viewprofileinfo() {
        System.out.println(name + " ");
        System.out.println(address + " ");
        System.out.println(regno + " ");
    }
}

public class objects_sort {
    public static void main(String[] args) {
        Students array[] = new Students[3];
        for (int i = 0; i < 3; i++) {
            array[i] = new Students();
        }
        for (int i = 0; i < 3; i++) {
            array[i].addprofileinfo();
        }
        sort_students(array);
        sort_vellore(array);

    }

    public static void sort_students(Students k[]) {
        Students temp = new Students();
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                if (k[j].name.compareTo(k[j + 1].name) > 0) {
                    temp = k[j];
                    k[j] = k[j + 1];
                    k[j + 1] = temp;
                }
            }
        }
        for (Students m : k) {
            m.viewprofileinfo();
        }
    }

    public static void sort_vellore(Students k[]) {
        for (int i = 0; i < k.length; i++) {
            if (k[i].address.contains("vellore")) {
                k[i].viewprofileinfo();
            }
        }
    }
}
