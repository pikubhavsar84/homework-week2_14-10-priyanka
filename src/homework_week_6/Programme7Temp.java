package homework_week_6;
/**
 * a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the temperature in Fahrenheit :");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32)*5/9;

        System.out.println("The temperature in Celsius is :" + celsius);
        scanner.close();//closing the scanner
    }
}
