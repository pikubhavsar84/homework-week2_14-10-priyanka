package homework_week_6;
//Java program that takes three numbers as input to calculate and
//print the average of the numbers

import java.util.Scanner;

public class Programme13AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter third number:");
        double thirdNumber = scanner.nextDouble();

        double ave = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of the three numbers is: " + ave);
        scanner.close();//closing scanner
    }
}
