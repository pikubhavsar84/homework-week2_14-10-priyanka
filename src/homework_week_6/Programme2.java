package homework_week_6;

/**
 * Declare two static variables
 * Declare one static method
 * Call both static variables into the static method inside the print statement.
 * Declare the Main method.
 * Call the static method into the Main method and Run the programme.
 */
public class Programme2 {
    static int a = 10;
    static String name= "Mona Lisa";

    public static void m1(){
        System.out.println(a);
        System.out.println(name);

    }

    public static void main(String[] args) {
        m1();
    }
}
