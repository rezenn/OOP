public class Operators {
    public static void main(String[] args) {
        /* arithemitc operators */
        int a = 10, b=10;
        int sum = a+b; //here the "+" is an arithemitic operator
        System.out.println("Addition of a+b is" + sum);
        System.out.println("diiference of a-b is "+ (a-b));
        System.out.println("multiplication of axb is "+(a*b));
        System.out.println("division of a/b is "+ (a/b));
        System.out.println("modulo of a and b is "+(a%b));

        /* assignment operators*/
        int Num1;
        Num1 = 10;
        /* or declare and assign */
        int Num2 = 20;
        /*assign with another variable */
        int Num3 = Num1;
        System.out.println("assignment with +=" + (Num1+=10));
        Num2 -= 30; //same as  num2 = num2 - 30
        System.out.println("assignment with -="+ Num2);

        /* relation operation*/
        int rNum1 = 10, rNum2 = 20;
        System.out.println("rNum1 equals to rNum2? "+ (rNum1==rNum2));
        System.out.println("rNum1 is greater than rNum2? "+ (rNum1> rNum2));
        System.out.println("rNum2 is greater than rNum1? "+ (rNum1< rNum2));
        System.out.println("rNum1 is less tahn or equal to rNum2? "+ (rNum1<= rNum2));
        System.out.println("rNum1 is not equal to rNum2? "+ (rNum1!= rNum2));

        /* logical operators */
        int bNum1 = 10 , bNum2 = 12;
        boolean bExpression1= bNum1 == bNum2;
        boolean bExpression2= bNum1 <= bNum2;
        System.out.println("And operator uses &&"+ (bExpression1 && bExpression2));
        System.out.println("Or operator uses ||"+ (bExpression1 || bExpression2));
        System.out.println("Not operator uses !"+ (!bExpression1 ));

        /* unary operators */
        int uNum1= 10;
        uNum1++; //meaning uNum1 == Unum1 +1
        System.out.println("Unary fir increament is ++"+ uNum1);
        uNum1--;
        System.out.println("Unary for decreament is --"+ uNum1);

        /* ternary operators  */
        int tNum1 = 10, tNum2 = 20;
        boolean tExp= tNum1 == tNum2;
        /* one line if else, see the given example in if else
         * string output;
         * if (tExp == true){
         *  output = "True statement";
         * }else{
         * output = "False statement";}
         */
        String output = tExp? "true Statement": "False statement";
        /* here we can assign a string out with one expression
         * if expression is true it will return the value after the "?"
         * if expression is false it will return the value after the ":"
         */
        int numOutput = tNum1 < tNum2? 10: 20;
        System.out.println(output);
        System.out.println(numOutput);
        /* task
         * 1.wap to print weather a variable is greater or = to 18
         *
         * 2. wap to print simple interest from variable 
         * makee 3 variable for amt, time, rate, and save the calculation into a variable
         * formula
         * si= amt*time*rate/100;
         * 
         * 3.wap to print the area n perimeter of rectangle
         * a= l x b
         * p= 2(l+b)
         * 
         * 4.complete the task 1 using ternary operator
         */

         //1
        int aNum = 10;
        System.out.println("anum is greater or equal to 18?"+ (aNum>=18));
        
        //2
        float amt = 65340, rate = 5.88f, time = 2;
        float si = amt*time*rate/100;
        System.out.println("the simple interst is "+ si);
        
        //3
        int len = 10, width = 20;
        float area= len * width;
        float perimeter= 2*(len+width);
        System.out.println("the area is "+ area);
        System.out.println("the perimeter is "+ perimeter);
        
        //4
        int tNumber1 = 10, tNumber2 = 18;
        boolean tExpression= tNumber1 == tNumber2;
        String outcome = tExpression? "true": "False";
        System.out.println(outcome);

    }
    
}
