package homework_week_6;
/**
 *  enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class Programme6Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("This area of the circle is : " + area);
        scanner.close();//closing the scanner
    }
}
