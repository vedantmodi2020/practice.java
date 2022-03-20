package string;

public class string1 {
    public static void main(String[] args) {
        String name = "Vedant";
        System.out.println(name + " modi");
        String nam1 = "Vedant";
        if (name.equals(nam1)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        System.out.println(nam1.compareTo(name));
        System.out.println(name.substring(2, 4));
        String name1 = name;
        System.out.println(name1);
        String name2 = "  vedant   ";
        System.out.println(name2.trim());
        System.out.println(name2.replace("e", "k"));
        System.out.println(name2.indexOf("v"));
        String n = "";
        if (n.isEmpty()) {
            System.out.println("please enter the value");

        }
        // .contains to check a word
        // .split() method is used to split the array by " " watever it is inside the ""

    }
}
