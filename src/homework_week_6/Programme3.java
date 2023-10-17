package homework_week_6;

/**
 *Declare one instance and one static variable.
 *Declare one instance method.
 *Declare one static method.
 *Call both instance and static variables into both instance and static methods inside the
 *print statement.
 *Declare the Main method.
 *Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    int a = 20; // instance variable
    static String name = "Mona Lisa";// static variable

    public void m1(){
        Programme3 t1 = new Programme3();
        System.out.println(t1.a);

    }
    public static void m2(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        obj.m1();
        obj.m2();

    }
}
