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
     // cube
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
      scan3.nextLine();
      System.out.println("Enter your intrest");
      String intrest = scan3.nextLine();
      System.out.println("Hey, my name is "+name+ " and my roll number is "+roll+". My field of interest are "+intrest+".");
      scan3.close();
      /*8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
      Take the attributes as user input. */
      Scanner scan4 = new Scanner(System.in);
      System.out.println("Enter the length of the square: ");
      float sideSqr = scan4.nextInt();
      float areaSqr = sideSqr*sideSqr;
      float perimeterSqr = 4* sideSqr;
      System.out.println("The area of the sqaure is "+ areaSqr+ " and the perimeter of the sqaure is "+ perimeterSqr);
      System.out.println("Enter the principle:");
      float principle = scan4.nextInt();
      System.out.println("Enter the rate:");
      float rateSI = scan4.nextInt();
      System.out.println("Enter the time:");
      float timeSI = scan4.nextInt();
      float simpleIntrest = principle*rateSI*timeSI/100;
      System.out.println("The simple intrest is "+ simpleIntrest);
       //triangle
       System.out.println("Enter the width of the triangle");
       float WidTri = scan4.nextInt();
       System.out.println("Enter the height of the triangle");
        float hgtTri = scan4.nextInt();
       float AreaTri = WidTri*hgtTri*1/2;
       System.out.println("The area of triangle is "+ AreaTri);
       //cuboid
       System.out.println("Enter the length of the cuboid");
       float LenCub = scan4.nextInt();
       System.out.println("Enter the width of the cuboid");
       float WidCub = scan4.nextInt();
        System.out.println("Enter the height of the cuboid");
        float HgtCub = scan4.nextInt();
       float Volcub = LenCub * WidCub * HgtCub;
       System.out.println("The volume of cuboid is "+ Volcub);
       //cube
      System.out.println("Enter the length of the cube");
       float lengthCube= 23.00f;
       float VolumeCube = lengthCube * lengthCube* lengthCube;
       System.out.println("The volume of cube is "+ VolumeCube);
      scan4.close();
      /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
      Scanner scan5 = new Scanner(System.in);
      System.out.println("Enter the length of the rectangle:");
      double lenRec = scan5.nextInt();
      System.out.println("Enter the breadth of the rectangle: ");
      double bthRec = scan5.nextInt();
      double areaRec = lenRec * bthRec;
     int doubleValueConversionToInt =(int) areaRec;
      System.out.println("the area of the rectangle is "+ doubleValueConversionToInt);
      scan5.close();
      /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
       And use the following conditions to generate the final result;
     a. If equal to or more than 70 -> First Class
     b. If more than 59 -> Upper Second Class
     c. If more than 49 -> Second class
     d. If more than 39 -> Third class and if below than 40 the result is fail. 
     Hint: Use ternary operator
    */
    Scanner scan6 = new Scanner(System.in);
    System.out.println("Enter the marks of the first subject:");
    float marks1 = scan6.nextInt();
    System.out.println("Enter the marks of the second subject:");
    float marks2 = scan6.nextInt();
    System.out.println("Enter the marks of the third subject:");
    float marks3 = scan6.nextInt();
   System.out.println("Enter the marks of the forth subject:");
    float marks4 = scan6.nextInt();
    float totalMarks = marks1+marks2+marks3+marks4;
    float totalPercentage = totalMarks/400*100;
    System.out.println("The total marks is "+totalMarks+ "and the total percentage is "+ totalPercentage);
    String result = (totalPercentage >= 70) ? "First Class"
    : (totalPercentage > 59) ? "Upper Second Class"
    : (totalPercentage > 49) ? "Second Class"
    : (totalPercentage > 39) ? "Third Class"
    : "Fail";
    System.out.println("your final grade is "+ result);
    scan6.close();



    }
}
