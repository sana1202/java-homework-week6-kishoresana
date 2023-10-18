package hwprogrammes;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    int i = 28; // instance variable
    static String name = "SLK"; // static variable

    // Declare one instance method
    public void d1(){
        System.out.println(i);
        System.out.println(name);
    }
    // Declare one static method
    public static void a1(){
        Program3 obj = new Program3();
        System.out.println(obj.i);
        System.out.println(name);
    }
    //Declare the Main method
    public static void main(String []args){
    Program3 t1 = new Program3();
    t1.d1();
    a1();
    }
}
