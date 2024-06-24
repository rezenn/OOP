import java.util.Scanner;

public class taskWeek4 {
    public static void main(String[] args) {
        // /*
        // * 1. Write a program that asks your name and prints “Hello your name” five
        // * times. Use a loop.
        // */
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = scan.nextLine();
        // for (int i = 1; i < 6; i++) {
        // System.out.println("Hello my name is " + name);
        // }
        // /*
        // * Write a program that displays the following table (note that 1 mile is
        // 1.609
        // * kilometers):
        // * Miles Kilometers
        // * 1 1.609
        // * 2 3.218
        // * … ….
        // * 9 14.481
        // * 10 16.090
        // */
        // for (int i = 1; i < 11; i++) {
        // float km = i * 1.609f;
        // System.out.println(i + " mile(s) is equal to " + km);
        // }
        // /*
        // * 3. Write a program that generates the following table:
        // * Number Square
        // * 10 100
        // * 9 81
        // * .. ….
        // * 2 4
        // * 1 1
        // */
        // for (int j = 10; j > 0; j--) {
        // int sqr = j * j;
        // System.out.println("Square of " + j + " is " + sqr);
        // }

        // /*
        // * 4. Write a program that reads the width and generates a corresponding
        // square
        // * of *. For example, if width = 5, output is:
        // *****
        // *****
        // *****
        // *****
        // *****
        // */
        // Scanner scan2 = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num = scan2.nextInt();
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= num; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // /*
        // * 5. Modify the above program by using a do..while loop so that it provides
        // the
        // * user with the option
        // * to continue running the program and enter more inputs. For example:
        // * Sample Run:
        // * Enter a positive non-zero integer 4
        // * Sum of 1 to 4 is 10
        // * Do you want to continue? Enter ‘y’ for yes or any other character for no.
        // * y
        // * Enter a positive non-zero integer 3
        // * Sum of 1 to 3 is 6
        // * Do you want to continue? Enter ‘y’ for yes and any other character for no.
        // * n.
        // */

        // Scanner scan3 = new Scanner(System.in);
        // String yes;
        // do {
        // System.out.println("Enter a positive non-zero integer: ");
        // int posNum = scan3.nextInt();
        // int finalnum = 0;
        // for (int i = 1; i <= posNum; i++) {
        // finalnum += i;
        // }
        // System.out.println("Sum of 1 to " + posNum + " is " + finalnum);
        // System.out.println("Do you want to continue? Enter ‘y’ for yes or any other
        // character for no.");
        // scan3.nextLine();
        // yes = scan3.nextLine();
        // } while (yes.equals("y"));
        // System.out.println("terminated");
        // scan3.close();

        /*
         * 6. Write a program that reads the width and generates a corresponding
         * triangle of *. For example, if width = 5, output is:
         *
         **
         ***
         ****
         *****
         * Use a nested for loop to generate the above pattern.
         */
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int pat = scan4.nextInt();
        for (int i = 1; i <= pat; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }

}
