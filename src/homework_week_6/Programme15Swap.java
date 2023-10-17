package homework_week_6;
//a Java program to swap two variables

public class Programme15Swap {

        public static void main(String[] args) {
            // Declare and initialize two variables
            int a = 50;
            int b = 25;

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            // Swap the values of a and b using a temporary variable
            int temp = a;
            a = b;
            b = temp;

            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }

