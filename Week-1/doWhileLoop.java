import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
        int num1 = 0;
        while (num1<0){
            System.out.println("While checks condition first");
        } 
        /*do while checks condition after the iteration */
        do{
            System.out.println("Do while checks condition after");
        }while(num1 < 0);
        /*This means do while loop runs at least once */ 

        /*task
         * use a while loop to
         * ask user for an int value
         * if the user input poitive value
         * promt user to input -VE VALUE
         * loop until the user input negative int value
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        int value = scan.nextInt();
        while (value>0 ) {
            System.out.println("Enter a negative number:");
            value = scan.nextInt();
        }
        System.out.println("you have entered a negative number of "+ value);
        scan.close();


    }
    
}
