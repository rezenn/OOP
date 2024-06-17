public class inhertanceTask {
    public static void main(String[] args) {
        labrador lab1 = new labrador();
        lab1.lifespan = 20;
        lab1.legs = 4;
        lab1.diet = "Meat";
        lab1.height = "1.2 meters";
        lab1.speak();
        lab1.fur();
        lab1.barks();
        lab1.myheight();
    }
}

class animal{
    int lifespan;
    void speak(){
        System.out.println("My lifespan is "+lifespan+".");
    }
}

class mammal extends animal{
    int legs;
    void fur(){
        System.out.println("Sudip has "+ legs +" and is very furry");
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
        System.out.println("Supid barks loudly.");
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
        System.out.println("my height is "+height);
    }
}

