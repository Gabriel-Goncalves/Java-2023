package org.example;

import org.example.basic.BasicOne;

import java.math.BigDecimal;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("What module do you wanna access?");
        System.out.println("1 - Basic");
        System.out.println("2 - ");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        System.out.println();
        switch (choice) {
            case 1:
                BasicOne.setup();
                break;
            default:
                break;
        }
    }
}