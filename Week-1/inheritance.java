public class inheritance {
    public static void main(String[] args) {
        childClass cc = new childClass();
        cc.firstName = "Ram";
        cc.lastName = "Kc";
        cc.info();
        cc.greet();

        grandChlid gc = new grandChlid();
        gc.firstName = "Ming";
        gc.middleName = "Hao";
        gc.lastName = "Xaio";
        gc.info();
        gc.greet();
        gc.call();

        uncleClass uc = new uncleClass();
        uc.lastName = "Xu";
        uc.job = "CFO";
        uc.info();
        uc.details();

        labrador lab1 = new labrador();
        lab1.lifespan = 20;
        lab1.legs = 4;
        lab1.diet = "Meat";
        lab1.height = "1.2";
        lab1.speak();
        lab1.fur();
        lab1.barks();
        lab1.myheight();
        
    }
    
}
class parentClass{
    String lastName;
    private int salary;
    protected String address;

    void info(){
        System.out.println("LastName " + lastName);
    }
}
//extends keyword used to create a chlid class
// single level, one parent has one chlid
class childClass extends parentClass{
    String firstName;

    void greet(){
        System.out.println("FirstName: "+ firstName+ " lastName: "+lastName);
    }
} 
// multi level
class grandChlid extends childClass{
    String middleName;
    void call(){
        System.out.println(firstName+ " "+ middleName+ " "+ lastName);
    }
}
// Tree
class uncleClass extends parentClass{
    String job;
    void details(){
        System.out.println(job + " "+ lastName);
    }
}

class animal{
    int lifespan;
    void speak(){
        System.out.println("My lifespan is "+lifespan+ " Sudip Sudip.");
    }
}

class mammal extends animal{
    int legs;
    void fur(){
        System.out.println("I have "+ legs +". sudip sudip");
    }
}

class reptile extends animal{
    int eggs;
    void shed(){
        System.out.println("I lay "+eggs+" eggs");
    }
}

class dog extends mammal{
    String diet;

    void barks(){
        System.out.println("My diet is "+diet+"sudip sudip");
    }
}

class gremanShepard extends dog{
    String name;

    void nameCall(){
        System.out.println("My name is "+ name);
    }
}
class labrador extends dog{
    String height;

    void myheight(){
        System.out.println("my height is "+height+" sudip Sudip");
    }
}
