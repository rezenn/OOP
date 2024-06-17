public class Encapsulation {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.setName("Apple M1");
        System.out.println("Name: "+laptop1.getName());
        laptop1.setBrand("Apple");
        System.out.println("Brand:"+laptop1.getBrand());
        laptop1.setPrice("100000");
        System.out.println("Price:"+laptop1.getPrice());
        laptop1.setYear(2023);
        System.out.println("Year:"+ laptop1.getYear());
    }
}
// bundle similar properties amnd functions into class
class Laptop{
    //data hiding can be done using private access modifier
    private String name;
    private String brand;
    private String price;
    private int year;
    // make read-only access using getter
    public String getName(){
        return this.name;
    }
    // make write-only access using setter
    public void setName(String name){
        this.name  = name;
    }
        /* task 
         * make getter and setter for all attributes
         * make 2 objects of laptop
         * output
         * Name: Apple m1
         * brand: Apple
         * price: 10000
         * Year: 2023
         */
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    String getPrice(){
        return this.price;
    }
    void setPrice(String price){
        this.price = price;
    }
    int getYear(){
        return this.year; 
    }
    void setYear(int year){
        this.year = year;
    }
    }

