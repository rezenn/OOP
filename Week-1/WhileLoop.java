import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        /* while takes boolean expression inside ()
         * the loop will run repeatatively while the boolean is true
         * if the boolean is false the loop will end
         */
        while ((count<5)) {
            System.out.println("while loop "+ count);
            ++count;
        }
        /* in whoile loop the condition is checked at the begining 
         * if the condition is false in initial check the loop will not run
        */
        System.out.println("Please type the value between 0-100");
        Scanner scan = new  Scanner(System.in);
        int inputValue = scan.nextInt();
        while (inputValue < 0 || inputValue > 100) {
            System.out.println("Please input between 0-100");
            inputValue = scan.nextInt();
        }
        System.out.println("end loop");
        scan.close();

    }
    
}
