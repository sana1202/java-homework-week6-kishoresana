package hwprogrammes;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program4 {
    int m = 10;
    int n = 20;
    static int o = 30;
    static int p = 40;

    //Declare one instance method
    public void m1(){
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
    }

    //Declare one static method
    public static void m2() {
        Program4 obj = new Program4(); // object creation
        System.out.println(obj.m); //instance variable into static method
        System.out.println(obj.n);// instance variable into static method
        System.out.println(o); // static variable into static method
        System.out.println(p); //static variable into static method
    }
    //Declare main method
    public static void main(String []args){
        //Call both instance and static methods into the Main method and run the programme
        Program4 t1 = new Program4(); // object creation
        t1.m1(); //instance method into main method
        m2(); // static method into main method
    }
}
