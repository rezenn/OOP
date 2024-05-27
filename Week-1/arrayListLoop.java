import java.util.ArrayList;
public class arrayListLoop {
    public static void main(String[] args) {
        /* import ArrayList from java.util */
        ArrayList<String> names = new ArrayList<>();
        names.add("Aayam");
        names.add("Adhar");
        names.add("Yausan");
        names.add("Niraj");
        names.add("Aayush");
        names.add("Rijan");

        /*to loop, find the length/element count, .size */
        int namesLength = names.size();
        /* loop same as array */
        for(int index = 0; index < namesLength; index++){
            //get each element with .get(index)
            String singleName = names.get(index);
            System.out.println("index " + index + " values "+ singleName);
        }
        /* using foreach in java, iterate with element/actual value */
        for(String element: names){
            System.out.println(element);
        }
        /* make an arraylist animals
         * ["cat","tiger","dog","elephant"]
         * make two more arraylist called, wildAnimal, domensticAnimal
         * if the element/value is "cat","dog",add in domesticAnimal
         * if the element/value is "tiger","elephant" add in wilfAnimals
         * print both arraylist
         */

         ArrayList<String> animals = new ArrayList<>();
         animals.add("Cat");
         animals.add("Tiger");
         animals.add("Dog");
         animals.add("Elephant");
         ArrayList<String> wildAnimals = new ArrayList<>();
         ArrayList<String> domesticAnimals = new ArrayList<>();
        for(String element : animals){
            if(element == "Cat"|| element == "Dog"){
                domesticAnimals.add(element);
            }else{
                wildAnimals.add(element);
            }
        }
        System.out.println(wildAnimals);
        System.out.println(domesticAnimals);
    }


}

