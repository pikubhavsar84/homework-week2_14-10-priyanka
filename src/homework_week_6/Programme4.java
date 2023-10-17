package homework_week_6;

/**
 *Declare two instance and two static variables.
 *Declare one instance method.
 *Declare one static method.
 *Call all four instance and static variables into both instance and static methods inside the
 *print statement.
 *Declare the Main method.
 *Call both instance and static methods into the Main method and run the programme
 */
public class Programme4 {
    int a = 10;//instance variable
    String name = "Mona";// instance variable
    static String surname = "Lisa";// static variable
    static int b = 20;// static variable

    public void m1(){

        System.out.println(a);
        System.out.println(name);
        Programme4 t2 = new Programme4();
        System.out.println(Programme4.surname);
        System.out.println(Programme4.b);


    }
    public static void m2(){
        Programme4 t1 = new Programme4();
        System.out.println(t1.a);
        System.out.println(t1.name);
        System.out.println(surname);
        System.out.println(b);
        t1.m1();


    }

    public static void main(String[] args) {
        m2();
    }

}
