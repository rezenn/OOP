public class polymorphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(1,2,3));
        mo.add();
        
        /* method overriding
        ploymorphism allow parent class to hold child object */
        Document d1 =new Document();
        d1.print("Dell XPS");
        Document d2 = new MsWord();
        d2.print("Xeroz");
        /* when doing so, through we are creating from Child class Msword() we can
        only function/ attribute from Document */
        Document d3 = new Office365();
        d3.print("Xeroz");
        //cannot access d3.internet
        
    }
}
// method Overloading
//same function with different in parameter

class MathOperation{
    int add(int num1, int num2){
        return num1+num2;
    }
    //1. method overloading with change in number of parameter
    int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    //2. method overloading with change in data type
    double add(double num1, double num2){
        return num1 + num2;
    }
    /* note the change in return type doesnot determine overloading 
    method overloading only determine with change in parameter
    also, changing the variable name is also not allowed
    eg: int add(int a, int b)-> is not allowed
    as function with 2 int is already made */
    void add(){
        System.out.println("Invaild Operation");
    }

}
 class Document{
    public void print(String printer){
        System.out.println("Document printing");
    }
 }
 //method overriding can only be done in child class 
 class MsWord extends Document{
    @Override
    public void print(String printer){
        System.out.println("Ms word prints");
    }
 }
 class Office365 extends MsWord{
    boolean internet = true;
    //Overriding can be done in multi layer inheritance
    @Override
    public void print(String printer){
        System.out.println("Online printer");
    }
 }