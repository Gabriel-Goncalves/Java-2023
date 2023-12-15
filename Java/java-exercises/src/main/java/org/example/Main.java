package org.example;

import org.example.basic.BasicOne;
import org.example.basic.Dummies;
import org.example.basic.TiposPrimitivos;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean teste;
        System.out.println("my teste");
        teste = false;
        System.out.println(teste);
        System.out.println(Locale.getDefault());
//        System.out.println("What module do you wanna access?");
//        System.out.println("0 - Dummy");
//        System.out.println("1 - Basic");
//        System.out.println("2 - Primitive Types");

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        Scanner s = new Scanner(System.in);
        float choice = s.nextFloat();
        System.out.println(choice * 2);
//        switch (choice) {
//            case 0:
//                Dummies.run();
//                break;
//            case 1:
//                BasicOne.setup();
//                break;
//            default:
//                TiposPrimitivos.setup();
//                break;
//        }
    }
}