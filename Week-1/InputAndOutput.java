import java.util.Scanner;
public class InputAndOutput{
public static void main(String[] args) {
    /*user output */
    System.out.println("This sentence will have line break.");
    /*system.out.print */
    System.out.print("This will not have line break.");
    System.out.print("This line will continue.\n");
    /* string formatting using system .out.printf
     * %s String, %d integer, %f floating point, %b boolean
     * this will also not break line
     */
    System.out.printf("Hello %s, good morning","world");
    System.out.printf("The number is %d",10);
    /* can use multiple formatter */
    System.out.printf("The floating %f and boolean %b\n", 10.3f,false);
    /* USer input
     * import java.util.Scanner; or import java.util.*; //copy this line at the top of the code
     */
    // Scanner scan = new Scanner (System.in);
    // System.out.println("The following take whole sentence.");
    // String wholeOutput = scan.nextLine();
    // System.out.println("the input taken is "+ wholeOutput);
    // System.out.println("The following take int");
    // int intInput = scan.nextInt();
    // System.out.println("The input taken is"+ intInput);
    // System.out.println("The following take double");
    // double doubleInput = scan.nextDouble();
    // System.out.println("The input taken is"+ doubleInput);
    // System.out.println("The following take boolean");
    // boolean booleanInput = scan.nextBoolean();
    // System.out.println("The input taken is "+ booleanInput);
    // scan.close(); // you must close the scanner once all input is taken

    /*Task
     * Make a new scanner object scan11
     * prompt the following and take input
     * what is your name? save the input string -> name
     * are you over 18? save input to boolean -> status
     * how many siblings? save input to integer -> siblings
     * print the following
     * hello name,
     * over 18? status
     * you have sibling number of siblings
     */

    Scanner scan1 = new Scanner (System.in);
    System.out.println("What is your name?");
    String name = scan1.nextLine();
    System.out.printf("hello "+ name);
    System.out.println("Are you over 18?");
    boolean status = scan1.nextBoolean();
    System.out.println("Over 18?"+ status);
    System.out.println("How many siblings?");
    int sibling = scan1.nextInt();
    System.out.println("You have "+ sibling + " siblings.");
    scan1.close();

    


}
    
}