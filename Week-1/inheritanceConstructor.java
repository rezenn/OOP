public class inheritanceConstructor {
    public static void main(String[] args) {
        Tshirt ts1 = new Tshirt();
        ts1.nameDifference("new");

        Tshirt ts2 = new Tshirt("My shirt");



    }
    
}

class shirt{
    String name = "parent shirt"; // super.name
    String type;
    shirt(){
        System.out.println("Parent Class");
    }
    shirt(String name){
        this.name = name;
        System.out.println("parent constructor with string params");
    }
}
class Tshirt extends shirt{
    String name = "class shirt"; // this.name
    Tshirt(){
        // default parent constructor is called automatically
        //super() or shirt()
        super("parent class");
        System.out.println("Child Class");
    }
    //overloading
    // same name function with different logic/ parameter
    Tshirt(String name){
        this.name = name;
        System.out.println("Constructor with string params");
    }
    Tshirt(int number, String name){

    }

    void nameDifference(String name){
        System.out.println("Param name: "+name);
        System.out.println("Class name: "+ this.name);
        System.out.println("Parent name: "+ super.name);
    }
}

/*make a class pant
 * make 2 attribute, texture and colour
 * make a class halfPant that extends pant
 * make 1 attribute color
 * make a constructor of pant that takes texture and color
 * make a non-param constructor for half pant and call
 * parent parameterized constructor, "wool" and "red"
 * make a function in halfPant called changePant
 * takes color as params and set the current color of pant to halfpant
 * and change the new color to halfpant
 */

 class pant{
    String texture;
    String color;
    pant (String texture, String color){
      this.texture = texture;
      this.color = color;
    }

 }
 class halfPant extends pant{
    String color;
    halfPant(){
        super("Wool","Red");
    }
    void changePant(String color){
        super.color = this.color;
        this.color = color;
    }
 }
 /*1. Write a Java program to create a class called Vehicle with a method called drive().
  Create a subclass called Car with method display() method to print details of the Car.

2. Let's examine the Java program given. It involves multiple classes that depict different book types, 
including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and 
a method called displayDetails(). This method is responsible for outputting the title and author of a book. 
The remaining classes inherit both the constructor and methods of the Book class as they extend it. */

 class vehicle{
    String name;
     void drive(){
        System.out.println("Driving");
    }
 }
 class car extends vehicle{
    String color;
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Color: "+color);
    }
 }

 class book{

    String name;
    book(){

    }
    void displayDetails(){

    }
 }
 class FictionBook extends book{
    
 }
 class NonFictionBook extends book{

 }
 class TechnicalBook extends book{

 }