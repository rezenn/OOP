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
