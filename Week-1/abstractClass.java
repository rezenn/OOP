public class abstractClass {
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        s1.call();
        s1.message();
        s1.delivery();

        Apple a1 = new Apple();
        a1.call();
        a1.message();
        a1.delivery();

    }
}

// to make abstract class, use abstract keyword before "class"
// if a class is abstract, it cannot be make object of
abstract class SmartPhone {
    /*
     * abstract function do not have a body
     * abstract class may or maynot contain abstract function
     * if there is at least one abstract function, class have to be abstract
     */
    abstract public void call();

    abstract public void message();

    abstract public boolean text(String text);

    public void delivery() {
        System.out.println("MY phone");
    }
}

// to use abstract class it has to be extended into sub/child class
class Samsung extends SmartPhone {
    // when abstract class is extended
    // all the abstract function must be overridden/ implemented
    @Override
    public void call() {
        System.out.println("Samsung calling");
    }

    @Override
    public void message() {
        System.out.println("Samsung Message");
    }

    @Override
    public boolean text(String text) {
        return true;
    }
}
/*
 * task create a class apple that extends smartphone
 * override the function
 * make an object of samsung and apple
 * and call all the function
 */

class Apple extends SmartPhone {
    @Override
    public void call() {
        System.out.println("Apple calling");
    }

    @Override
    public void message() {
        System.out.println("Apple Message");
    }

    @Override
    public boolean text(String text) {
        return true;
    }

}
/*
 * You are building a shape hierarchy for a drawing application. Design an
 * abstract class named "Draw" with the following abstract methods:
 * calculateVolume(): This method should calculate and return the area of the
 * shape
 * calculateArea(): This method should calculate and return the area of the
 * shape.
 * calculatePerimeter(): This method should calculate and return the perimeter
 * of the shape.
 * Implement the abstract class and provide concrete implementations for the
 * abstract methods.
 * Create subclasses for different shapes such as "circle," "rectangle," and
 * "triangle."
 * Each subclass should provide specific implementations for calculating the
 * volume, area and perimeter of that shape.
 * Create instances of each shape class and demonstrate how you can calculate
 * their respective volume, areas and perimeters.
 */

abstract class draw {

    abstract float calculateArea();

    abstract float calculatePerimeter();
}

class circle extends draw {
    float radius = 10;

    @Override
    float calculateArea() {
        return 22 / 7 * radius * radius;
    }

    @Override
    float calculatePerimeter() {
        return 2 * 22 / 7 * radius;
    }
}

class rectangle extends draw {
    float length = 231;
    float breadth = 312;

    @Override
    float calculateArea() {
        return length * breadth;
    }

    @Override
    float calculatePerimeter() {
        return 2 * (length * breadth);
    }
}

class triangle extends draw {
    float length1 = 21;
    float length2 = 31;
    float length3 = 22;
    float height = 12;

    @Override
    float calculateArea() {
        return 1 / 2 * (length1 * height);
    }

    @Override
    float calculatePerimeter() {
        return length1 + length2 + length3;
    }
}