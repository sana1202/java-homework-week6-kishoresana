package hwprogrammes;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */
public class Program2 {
    static int k = 13; // k is static variable
    static String name = "Prime"; // name is static variable

    //Declare one static method
    public static void p2(){
        System.out.println(k);
        System.out.println(name);
    }
    //Declare the Main method
    public static void main(String []args){ p2(); //calling the static method into the Main method

    }

}
