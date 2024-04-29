import java.util.Scanner;

public class TaskWeek2 {
    public static void main(String[] args) {
       /*1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */ 
    int Num = 19;
    if(Num>18){
        System.out.println("The person is allowed to vote.");
    }
    else{
        System.out.println("The person is not allowed to vote.");
    }

       /*2. Write a program to calculate SI. 
    Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
    float PrincipleAmount = 65340, Rate = 5.88f, Time = 2;
    float SI = PrincipleAmount*Rate*Time/100;
    System.out.println("the simple interst is "+ SI);

    /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
    Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
    //triangle
    float WidTriangle = 59 , hgtTriangle = 10.99f;
    float AreaTriangle = WidTriangle*hgtTriangle*1/2;
    System.out.println("The area of triangle is "+ AreaTriangle);
    //cuboid
    float LenCuboid = 12.43f, WidCuboid = 10.00f, HgtCuboid = 15.44f;
    float Volcuboid = LenCuboid * WidCuboid * HgtCuboid;
    System.out.println("The volume of cuboid is "+ Volcuboid);
    //cube
    float Side = 23.00f;
    float VolCube = Side * Side * Side;
    System.out.println("The volume of cube is "+ VolCube);

    /*4. Write the ternary operator for question no. 1 */
    int tNum1 = 19, tNum2 = 18;
    boolean tExp= tNum1 > tNum2;
    System.out.println("Is the person allowed to vote? "+tExp );

    /*5. Write a program to take two integer inputs from the user and print the sum and product of them. */
    Scanner scan1 = new Scanner (System.in);
    System.out.println("Enter the first number :");
    int num1 =  scan1.nextInt();
    System.out.println("Enter the second number :");
    int num2 =  scan1.nextInt();
    int Total = num1 + num2;
    System.out.println("the total is " + Total);
    scan1.close();

    /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
    Finally, calculate the division of the thus obtained sum and product and print the result. */
    Scanner scan2 = new Scanner (System.in);
    System.out.println("Enter the first number :");
    int Number1 =  scan2.nextInt();
    System.out.println("Enter the second number :");
    int Number2 =  scan2.nextInt();
    int Sum = Number1 + Number2;
    float Product = Number1 * Number2;
    float Result = Product / Sum;
    System.out.println("the total is " + Result);
    scan2.close();

    /*7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ.
     My field of interest are xyz. */
     Scanner scan3 = new Scanner(System.in);
     System.out.println("Enter your name");
     String name = scan3.nextLine();
     System.out.println("Enter your roll");
     int roll = scan3.nextInt();
     System.out.println("Enter your intrest");
     String intrest = scan3.nextLine();
     System.out.println("Hey, my name is"+name+ "and my roll number is "+roll+". My field of interest are "+intrest+".");

    }
}
