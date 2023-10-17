package homework_week_6;
//a Java program to add two binary numbers

import java.util.Scanner;

public class Programme16TwoBinary {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first binary number
        System.out.print("Input first binary number: ");
        String binary1 = scanner.next();

        // Prompt the user to enter the second binary number
        System.out.print("Input second binary number: ");
        String binary2 = scanner.next();

        // Convert binary strings to integers and add them
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;

        // Convert the result back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Display the result
        System.out.println("Binary Addition Result: " + binarySum);
        scanner.close();//closing scanner
    }
}