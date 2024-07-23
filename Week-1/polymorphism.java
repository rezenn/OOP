public class polymorphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(1,2,3));
        mo.add();

        MathOperation mo2 = new MathOperation();
        System.out.println(mo2.substraction(35, 23));
        System.out.println(mo2.substraction(45, 11, 5.3));
        System.out.println(mo2.substraction(19.2, 2.3, 3.2));
        mo2.substraction(2);
        
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

        SpreadSheet s1 = new SpreadSheet();
        s1.addRow(3);
        s1.addColumn(4);
        SpreadSheet s2 = new MsExcel();
        s2.addRow(5);
        s2.addColumn(3);
        
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

    int substraction (int num1, int num2){
        return num1 - num2;
    }
    double substraction (double num1, double num2, double num3){
        return num1 - num2 - num3;
    }
    public void substraction(int num1){
        System.out.println("invalid operation");
    }
    double substraction(int num1, int num2, double num3){
        return num1 - num2 - num3;
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

 // Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object

// Task
// Make a function substraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object

class SpreadSheet{
    public void addRow(int row){
        System.out.println("Row"+row+" has been added.");
    }
    public void addColumn(int coloumn){
        System.out.println("Cloumn "+coloumn+" has been added.");
    }
}
class MsExcel extends SpreadSheet{
    @Override
    public void addRow(int row){
        System.out.println("Row "+row+" has been removed.");
    }
    @Override
    public void addColumn(int coloumn){
        System.out.println("Cloumn "+coloumn+" has been removed.");
    }
    String fileType = "txt";
}

