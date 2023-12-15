package org.example.basic;

import java.util.Scanner;

public class StringType {

    public static void setup() {
        System.out.println("Witch one do you wanna run?");
        System.out.println("1 - String types");
        System.out.println("2 - String Operations");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                stringMethods();
                break;
            case 2:
                ;
                break;
            default:
                break;
        }
    }

    public static void stringMethods() {
        System.out.println("Hello folks".charAt(2));
    }
}
