import java.util.Scanner;
public class TaskWeek3 {
    public static void main(String[] args) {
         /*1. Write a JAVA program to find the maximum between three numbers.*/
       Scanner scan = new Scanner(System.in);
       System.out.println("enter any 3 numbers ");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       int num3 = scan.nextInt();
       if(num1> num2){
         if(num1>num3){
           System.out.println("the greatest no is "+num1);
         }
       }
       else if(num3> num2){
         if(num3> num1){
           System.out.println("the greatest no is "+num3);
         }
       }
       else{
         System.out.println("the greatest no is "+num2);
       }
       scan.close();
      
       /*2. Write a JAVA program to check whether a number is negative, positive, or zero. */
       int number = 78;
     if(number>0){
       System.out.println("It is positive "+number);
     }
     else if(number<0){
       System.out.println("It is negative "+number);
     }
     else{
       System.out.println("The number is 0");
     }
     /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
     int divNumber = 55;
     if(divNumber%5 == 0){
       if(divNumber%11 ==0){
         System.out.println("The number "+divNumber+" is divisible by 5 and 11.");
       }
     }
     else{
       System.out.println("The number "+divNumber+" is not divisible by 5 and 11.");
     }
     /*4. Write a JAVA program to check whether a number is even or odd. */
     int oddEven = 19;
     if(oddEven%2 == 0){
         System.out.println("The number "+oddEven+" is even.");
     }
     else{
       System.out.println("The number "+oddEven+" is odd.");
     }
     /*5. Write a JAVA program to check whether a year is a leap year or not. */
     Scanner scan3 = new Scanner(System.in);
     System.out.println("Enter a year");
     int year = scan3.nextInt();
     if(year % 4==0){
       System.out.println("The given year is leap year.");
     }
     else if(year%400==0){
       System.out.println("The given year is leap year.");
     }
     else if(year%100!=0 ){
       System.out.println("The given year is leap year.");
     }
     else{
       System.out.println("The given year is not leap year.");
     }
     scan3.close();

     /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
     Scanner scan4 = new Scanner(System.in);
     System.out.println("Enter a alphabet:");
     String alpha = scan4.nextLine();
     if(alpha=="a"){
       System.out.println(" the given alphabet is vowel.");
     }
     else if(alpha=="e"){
       System.out.println(" the given alphabet is vowel.");
     }
     else if(alpha=="i"){
       System.out.println(" the given alphabet is vowel.");
     }
     else if(alpha=="o"){
       System.out.println(" the given alphabet is vowel.");
     }
     else if(alpha=="u"){
       System.out.println(" the given alphabet is vowel.");
     }
     else{
       System.out.println("The given alphabet is consonant.");
     }
     scan4.close();

     /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and 
     converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
     Scanner scan9 = new Scanner(System.in);
     System.out.println("Enter your grade: ");
     String grade = scan9.nextLine();
     switch (grade) {
       case "A":
       System.out.println("Your GPA is 4.0");
       break;
       case "B":
       System.out.println("Your GPA is 3.6");
       break;
       case "C":
       System.out.println("Your GPA is 2.8");
       break;
        case "D":
       System.out.println("Your GPA is 2.0");
       break;
       case "F":
       System.out.println("Your GPA is 1.6");
       break;
       default:
       System.out.println("Enter correct grade.");
         break;
     }
     scan9.close();

     /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and
      performs the corresponding arithmetic operation using a switch case statement. */

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first number: ");
      int number1 = input.nextInt();
      System.out.println("Enter the second number: ");
      int number2= input.nextInt();
      System.out.println("Entrer the operation: ");
      String operator = input.nextLine();
      switch (operator) {
       case "+":
       int add = number1 + number2;
       System.out.println("The sum is "+ add);
         break;
         case "-":
         int difference = number1 - number2;
         System.out.println("The difference is "+ difference);
           break;
           case "*":
       int mul = number1 * number2;
       System.out.println("The multiplication is "+ mul);
         break;
         case "/":
       int div = number1 / number2;
       System.out.println("The division is "+ div);
         break;
     
       default:
       System.out.println("Enter the correct operation.");
         break;
      }
      input.close();

      /*3. Write a Java program that takes an integer input (1 to 12) representing a month and 
      prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
      Scanner scan10 = new Scanner(System.in);
     System.out.println("Enter no from 1-12: ");
     int season = scan10.nextInt();
     switch (season) {
       case 1:
       System.out.println("winter");
       break;
       case 2:
       System.out.println("winter");
       break;
       case 3:
       System.out.println("winter");
       break;
        case 4:
       System.out.println("spring");
       break;
       case 5:
       System.out.println("spring");
       break;
       case 6:
       System.out.println("spring");
       break;
       case 7:
       System.out.println("summer");
       break;
       case 8:
       System.out.println("summer");
       break;
        case 9:
       System.out.println("summer");
       break;
       case 10:
       System.out.println("fall");
       break;
       case 11:
       System.out.println("fall");
       break;
       case 12:
       System.out.println("fall");
       break;
       default:
       System.out.println("Enter correct number.");
         break;
     }
     scan10.close();

    /*4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle)
     based on the user's choice using a switch case. */
     Scanner sap = new Scanner(System.in);
     System.out.println("Enter the shape: ");
     String shape = sap.nextLine();
     switch (shape) {
      case "circle":
      System.out.println("Enter the radius of the circle: ");
      int radius = sap.nextInt();
      int circle = 22/7* radius*radius;
      System.out.println("The area of the circle is "+ circle);
        break;
      case "rectangle":
      System.out.println("Enter the length  of the rectangle: ");
      int recLen = sap.nextInt();
      System.out.println("Enter the width  of the rectangle:");
      int recWid = sap.nextInt();
      int recArea = recLen*recWid;
      System.out.println("The area of the rectangle is "+ recArea);
        break;
      case "square":
      System.out.println("Enter the length of the square: ");
      int sqrLen = sap.nextInt();
      int sqrArea = sqrLen*sqrLen;
      System.out.println("The area of the sqare is "+ sqrArea);
        break;
      case "triangle":
        System.out.println("Enter the heigth of the triangle: ");
        int triHgt = sap.nextInt();
        System.out.println("Enter the width of the triangle:");
        int triwid = sap.nextInt();
        int triArea = 1/2*triHgt*triwid;
        System.out.println("The area of the triangle is "+ triArea);
          break;
      default:
      System.out.println("Enter the correct shape.");
        break;
     }
     sap.close();
  }
}
