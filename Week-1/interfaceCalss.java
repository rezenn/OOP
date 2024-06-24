public class interfaceCalss {
    public static void main(String[] args) {

    }
}

// make interface similar to class with "interface" keyword
// interface is automatically abstract

interface AnimalInterface {
    // functioninside the interface is automatically abstract
    // function hidden or no body
    public void eat();

    public void sleep();
}

// interafce can extend interface
interface MammalInterface extends AnimalInterface {
    public int legs();
}

// can eat on multi level
interface DogInterface extends MammalInterface {
    public String barks();
}

interface DomesticInterface {
    public void pet();
}

// class can implement multiple interface
// when so both of the interface function should be overriden
class Husky implements DogInterface, DomesticInterface {
    // if the interface is built/extended on top of another intrerface
    // all the function on top of the interface should be overriden
    @Override
    public void pet() {
        System.out.println("Husky likes pets.");
    }

    @Override
    public void eat() {
        System.out.println("Husky eats fish.");
    }

    @Override
    public void sleep() {
        System.out.println("Husky sleeps at dusk.");
    }

    @Override
    public int legs() {
        return 4;
    }

    @Override
    public String barks() {
        return "Woof Woof";
    }
}

// to use interface use "implements" keyword
class Bulldog implements AnimalInterface {
    // using interface, we need to override/ make body of all the function of
    // interface
    @Override
    public void eat() {
        System.out.println("Bulldog eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Bulldog sleeps at night.");
    }
}

class Cow implements AnimalInterface {
    @Override
    public void eat() {
        System.out.println("Cow eats grass.");
    }

    @Override
    public void sleep() {
        System.out.println("Cow sleeps at morning.");
    }
}

