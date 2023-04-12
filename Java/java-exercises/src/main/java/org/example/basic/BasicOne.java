package org.example.basic;

import java.util.Scanner;

public class BasicOne {

    public static void setup() {
        System.out.println("Witch one do you wanna run?");
        System.out.println("1 - Circle area");
        System.out.println("2 - Fahrenheit to Celsius");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                circleArea();
                break;
            case 2:
                fahrenheitInCelsius(43.0);
                break;
            default:
                break;
        }
    }

    public static void circleArea() {
        final double PI = 3.14;
        double raio = 5.34;

        double area = PI * Math.pow(raio, 2);

        System.out.printf("Area = %.2f%n", area);
    }

    public static void fahrenheitInCelsius(final Double fahrenheitDegrees) {
        final Double celsiusDegrees =  (fahrenheitDegrees - 32) / 1.8;
        System.out.printf("\n%.1f Fahrenheit in Celsius is %.1f celsius degrees\n", fahrenheitDegrees, celsiusDegrees);
    }

}
