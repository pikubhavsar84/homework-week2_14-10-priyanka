package homework_week_6;
//Java program to convert a decimal number to binary number

import java.util.Scanner;

public class Programme17DecimalToBinary {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        // Convert the decimal number to a binary string
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Display the result
        System.out.println("Binary number is: " + binaryNumber);
        scanner.close();//closing scanner

    }
}

