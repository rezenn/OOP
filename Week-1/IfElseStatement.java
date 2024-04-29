public class IfElseStatement {
    public static void main(String[] args) {

        /* simple if example */
        if(true){
            System.out.println("true statement");
        }

        /*if takes an expression with boolean value */
        int num1 = 10 , num2 = 20;
        if(num1>num2){
            System.out.println("greater");
        }else{
            System.out.println("lesser");
        }

        /*if else if , 2 conditions */
        if(num1==num2){
            System.out.println("equals");
        }else if(num1 < num2){
            System.out.println("lesser num2");
        }else{
            System.out.println("greater");
        }
        /* note that the else should be at last and is not mandatory */
       
        /* if else if ladder multiple statemnent */
        if(num1<0){
            System.out.println("num1 is negative");
        }else if(num2<0){
            System.out.println("num2 is negative");
        }else if(num1 != num2){
            System.out.println("not equal");
        }else if(num1<num2){
            System.out.println("greater");
        }else{
            System.out.println("default statement");
        }
        /* if any condition matche it will skip all tthe remaining
         * conditions including else, condition will be checked fro top-bottom
         */

        /*nested if condition */
        if(num1>0){
            if(num1>num2){
                System.out.println("positive and greater");
            }else{
                System.out.println("postive and lesser");
            }
        }else{
            if(num1 > num2){
                System.out.println("negative and lesser");
            }else{
                System.out.println("negative and lesser");
            }
        }

        /*  */
    }
}
