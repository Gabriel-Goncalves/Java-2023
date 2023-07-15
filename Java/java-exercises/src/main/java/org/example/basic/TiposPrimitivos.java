package org.example.basic;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void setup() {
        System.out.println("Witch one do you wanna run?");
        System.out.println("1 - Primitive types");
        System.out.println("2 - String Operations");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                primitiveTypes();
                break;
            case 2:
                stringCases();
                break;
            default:
                break;
        }

    }

    public static void primitiveTypes() {

        // Integer Numeric Types
        byte age = 24;
        short flyQuantity = 937;
        int id = 5434562;
        long points = 3_123_879_222L;

        // Reals Numeric Types
        float salary = 11_445.5F;
        double totalSells = 2_991_779_103.01;

        // Boolean Type
        boolean isActive = false;

        // Character Type
        char status = 'a';
    }

    public static void stringCases() {
        String s = "Buenos dias X";
        s.toUpperCase();
        System.out.println(s);

        System.out.println("Just use the toUpperCase won't change the original string s, the change will be in the return");

        s = s.toUpperCase();
        System.out.println(s);

        System.out.println("\n\n");

        s = s.replace("X", "sir");

        System.out.println(s);
    }
}
