public class oop {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ram";
        person1.age = 13;
        person1.gender = 'M';

        System.out.println(person1.name);
        person1.introduction();

        /*task create two objectas of person and call introduction function */
    
        Person person2 = new Person();
        person2.name ="Jane";
        person2.age = 22;
        person2.gender = 'F';
        person2.introduction();

        Person person3 = new Person();
        person3.name = "Ron";
        person3.age = 32;
        person3.gender = 'M';
        person3.introduction();
        
        Rectangle rec1 = new Rectangle();
        rec1.length = 11;
        rec1.breadth = 98;
        int arearec1 = rec1.areaOfRectangle();
        System.out.println("Area of rec1 is "+arearec1);
    
        Car car1 = new Car();
        car1.name = "Audi";
        car1.color = "Blue";
        car1.year = 2025;

        Car car2 = new Car();
        car2.name = "BMW";
        car2.color = "Red";
        car2.year = 2030;
    
        Car car3 = new Car();
        car3.name = "Ferrari";
        car3.color = "Yellow";
        car3.year = 2023;
        
        car1.start();
        car1.stop();
        car2.start();
        System.out.println("The expiry date is "+ car2.expiry()+ ".");
        car3.start();
        int exp2 = car3.expiry();
        System.out.println("The expiry date is "+exp2+".");

        student student1 = new student();
        student1.first_name = "Rezen";
        student1.last_name = "Khadgi";
        student1.student_id = 230504;
        student1.age = 19;
        System.out.println("Your name is "+student1.full_name());
        student1.description();
        System.out.println("Are you under 18? "+student1.overEighteen());
    }
}

/* create a class student
 * attribute
 * first name
 * last name
 * student id
 * age 
 * 
 * function
 * full name() return first name + last name
 * description() print full name and student id
 * over 18() return boolean weather student is over 18 or not
 * 
 * make a object of your details
 * print your full name
 * call description 
 * print if you are over 18 or not
 */

 class student{
    String first_name;
    String last_name;
    int student_id;
    int age;

    String full_name(){
        String name= first_name + " " +last_name;
        return name; 
    }
    void description(){
        System.out.println("Your full name is "+first_name+ " "+ last_name+ " and your student id is "+student_id+".");
    }
    boolean overEighteen(){
        if(age>18){
            return true;
        }else{
            return false;
        }
    }
 }

class Car{
    String name;
    String color;
    int year;

    void start(){
        System.out.println(name+ " is starting.");
    }
    void stop(){
        System.out.println(name +" of color "+color+ " is stopping.");
    }
    int expiry(){
        int expriryDate = year + 100;
        return expriryDate;
    }
}
class Rectangle{
    int length;
    int breadth;

    int areaOfRectangle(){
        int area = length*breadth;
        return area;
    }
}
class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("Name: "+ name+" Age: "+ age);
    }
}