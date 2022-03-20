package array;

import java.util.*;

public class inbuilt_methods_array {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.binarySearch(a, 6));
        System.out.println(Arrays.binarySearch(a, 7));
        System.out.println(Arrays.binarySearch(a, 0, 3, 5));
        // equals method in arrays class
        int a1[] = { 1, 2, 3, 4, 5, 6 };
        int a2[] = { 1, 2, 3, 4, 5, 6 };
        int a3[] = { 2, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.equals(a, a3));
        System.out.println(Arrays.equals(a2, a1));
        // if same numbers in different order then also it gives also
        // sorting uisng the inbuilt methods
        int a4[][] = { { 1, 2 }, { 2, 3 } };
        Arrays.sort(a3);
        for (int k : a3) {
            System.out.println(k);
        }
        int a22[][] = new int[2][2];
        a22 = a4.clone();
        a4[0][0] = 5;
        // System.arraycopy(a4, 2, a22, 0, 4);
        for (int p[] : a22) {
            for (int j : p) {
                System.out.println(j);
            }

        }
    }
}
