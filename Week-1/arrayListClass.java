import java.util.ArrayList;
public class arrayListClass {
    public static void main(String[] args) {
        /*to use arrayList import at the top like scanner from java.utils */
        ArrayList<String> animals = new ArrayList<>();
        /*size is automatically allocated according to the element
         * to add data in animals
         */
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        System.out.println(animals);
        /*can add element directly to index, it will shift rest to +1 of index */
        animals.add(1,"Tiger");
        System.out.println(animals);
        /*notice how the previous 1 and rest are shifted by 1 index */
    /*to remove use .remove(index) */
        animals.remove(2);
        System.out.println(animals);
        /*it will remove item/elements in 2nd index */

        //to update .set(index,value)
        animals.set(1,"snake");
        System.out.println(animals);
        // to access connot use [index] -> square bracket, use.get(index)
        System.out.println(animals.get(0)); //get 0th index element

        /* make an array of int 
         * [100,200,300,400,500]
         * remove 300
         * add -100 at ythe first of array
         * change 200 - 210
         * change 400 - 420
         * print array
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.add(0  ,-100);
        System.out.println(numbers);
        numbers.set(2, 210);
        numbers.set(3, 420);
        System.out.println(numbers);


    }

    
}
