public class FunctionClass {
     /* write a function inside a class */
     void printSomething(){
        System.out.println("this is a function.");
     }
     /*in the function void means nothing/null */
     /*with return type as int */
     int returnInteger(){
        int returnThis = 1;
        return returnThis;
     }
     /* with return and paras */
     boolean returnString(int num1, int num2){
        boolean check = num1 == num2;
        return check;
     }
    public static void main(String[] args) {
        /*to use a function you need to make object
         * note just remember the syntax for now
         */
        FunctionClass fc = new FunctionClass();
    fc.printSomething();
    /*you can call this function anytime in need */
    fc.printSomething();
    /*if a function has a return type other that void we can save it */
    int callIntFunction = fc.returnInteger();
    System.out.println("function with return int "+ callIntFunction);
    boolean callReturnString = fc.returnString(10, 20);
    System.out.println(callReturnString);
        

    }
    
}
