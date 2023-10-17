package homework_week_6;
/**
 * Java program that takes a number as input and prints its
 * multiplication table up to 10
 */

import java.util.Scanner;

public class Programme10MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <=10; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
            scanner.close();
        }
    }
}
