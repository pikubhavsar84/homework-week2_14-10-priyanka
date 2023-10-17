package homework_week_6;

/**
 * Declare two instance variables.
 * Declare one instance method.
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
int a = 20;// instance variable
    int b = 30;// instance variable
        String name = "Mona"; // instance variable

    public void myMethod(){
        Programme1 obj = new Programme1();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.name);
    }

    public static void main(String[] args) {
        Programme1 t1 = new Programme1();
        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(t1.name);

    }
}
