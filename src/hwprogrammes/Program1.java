package hwprogrammes;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {
    //  1.1 Declare two instance variables.
    int k = 2; // k is an Instance Variable
    String name = "Kishore"; // name is Instance variable

    //1.2 Declare one instance method
    public void method(){
        System.out.println(k);
        System.out.println(name);

    }
     //1.4 Declare the Main method.
    public static void main(String []args){
        Program1 x= new Program1(); // Object creation
        x.method(); // Instance method Declared into main method
    }
}
