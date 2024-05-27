public class accessmodifier {
    public static void main(String[] args) {
        AccessExample ac1 = new AccessExample();
        //ac1.intValue = 100;
        ac1.strValue = "Test";
        ac1.boolValue = true;
        ac1.setPrivate();
       
    task1 t1 = new task1();
    t1.sendData("Ram", 18);
    t1.address = "KTM";
    t1.printDetails();
    
    }
}
class task1{
    // create a private variable for Name, Age
    /* create a public variable for address 
     * make a function to fill data for name and age 
     * make a function to print name age and address
     */
    private String name;
    private int age;
    public String address;
    void sendData(String name, int age){
        this.name = name;
        this.age = age;
    }
    void printDetails(){
        System.out.println("Name: "+ name+ " Age: "+ age+ " Address: "+address);
    }
}
class ThisExample{
    private int length;
    private int breadth;
    void fillData(int length, int breadth){
        this.length = length; // this repressent current class atribute
        this.breadth  = breadth; // the breadth without this represent the args/parameter of function
    }
}
class AccessExample{
    private int intValue; //can only be used inside class scope
    public String strValue; //can be used anywhere
    boolean boolValue; // automatically default, can be used only inside a same package/ folder

    //similarly can be used in function
    private void doPrivate(){
        System.out.println("I can be accessed only in this class");
    }

    public void doPublic(){
        System.out.println("I can be accessed gfrom anywhere.");
    }
    void doDefault(){
        System.out.println("I can be accessed from current package/floder");
    }

    //private can be used in class
    void setPrivate(){
        intValue = 100; //private can be accesed here
        doPrivate(); // same goes to private functions
    }
}