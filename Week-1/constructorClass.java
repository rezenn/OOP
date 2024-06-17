public class constructorClass {
    public static void main(String[] args) {
        ConExample con1 = new ConExample();
        System.out.println("After object creation");
        parameterizedConstructor pc1 = new parameterizedConstructor(10);
        System.out.println("From object: "+pc1.length);

        FruitBasket Fb = new FruitBasket(12, 10, 60);
        int print= Fb.totalCount();
        System.out.println("Total count is "+ print);

        FruitBasket op2 = new FruitBasket(34, 43, 34);
        System.out.println("Total count "+ op2.totalCount());
    }
}
/*
 * task
 * make a class FruitBasket
 * make a private attribute, applecount, cherryCount, grapeCount
 * make  a constructor and set all attribute
 * make a fuction that returns total count of fruits
 * make 2 objects 
 * print the total counts of all objects
 */
class FruitBasket{
    private int applecount;
    private int cherryCount;
    private int grapeCount;
    FruitBasket(int applecount, int cherryCount, int grapeCount){
        this.applecount = applecount;
        this.cherryCount = cherryCount;
        this.grapeCount = grapeCount;
    }
    public int totalCount(){
        int count = this.applecount+this.cherryCount+this.grapeCount;
        return count;
    }
}
class ConExample{
    ConExample(){
        System.out.println("This is non parameterized constructor");
    }
}
class parameterizedConstructor{
    int length;
    parameterizedConstructor(int length){
        this.length = length;
        System.out.println(this.length);
    }
}