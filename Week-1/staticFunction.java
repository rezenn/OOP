public class staticFunction {
    /* in the following public and static is optional */
    public static int addTwoNum(int a, int b) {
        int sum = a+ b;
        return sum;
        
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return"Coke";
        }
        if(menu == 2){
            return"Water";
        }
        if(menu == 3){
            return"Frooti";
        }
        return "nothing";
    }
    public static boolean checkEven(int a){
        if( a%2 == 0){
           return true; 
        }
        else{
            return false; 
        }
    }
    public static String checkEligible(int age, String name){
        if(age<18){
            return "sorry "+name+", you are not eligible.";
        }
        else{
            return "Congratulation "+name+", you are eligible.";
        }

    }
    public static double mul(int nuumber1, int number2){
        return number2*nuumber1;
    }
    public static void main(String[]args){
        /* if a function is static no need to make object
         * if the function is static in same class you can simple call the method
         */
        int sumReturn = addTwoNum(10, 30);
        System.out.println("the sum is "+sumReturn);
        String frooti = vendingMachine(3);
        System.out.println("frooti check "+frooti);
        
        /*task make a function checkeven
         * that takes one int
         * that returns a boolean
         * if the int is even return true else false
         */
        boolean evenNum = checkEven(10);
        System.out.println(evenNum);

        /*task2
         * make a function checkEligible
         * that takes one int age , one string name
         * if the age is <18
         * return string "sorry name , you are not eligible"
         * else return"Congratulation name , you are eligible."
         */
        String yearsOld = checkEligible(15, "qwerty");
        System.out.println(yearsOld);
         /* 
         * task 3
         * make a function makemultiply
         * that takes 2 double
         * return a double wth the multiplication of two.
         */
        double multi = mul(145, 289);
        System.out.println(multi);

        
    }
    
}
