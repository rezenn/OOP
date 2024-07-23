public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Prograam start");
        int num1 = 100;
        try{
        int num2 = 100/0; //exception program
        }catch(ArithmeticException ex){
            System.out.println("Number error");
        }finally{
            System.out.println("I run with or without exception");
        }
        int[] numArr = new int[5];
        numArr[0] = 10;
        try {
            numArr[100] = 23;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is not long enough");
        }
        String data = null;
        //any class can be set to null
        try{
        System.out.println(data.length()); //data.length()- number of character
        }catch(NullPointerException e){
            System.out.println("Null data");
        }
        // multi- level try catch
        try {
            int inD1 = 32;
            int inD2 = 32/0;
            String data2 = null;
            System.out.println("Try exit");
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
        }
        catch(NullPointerException e){
            System.out.println("Null ayo");
        }finally{
            System.out.println("Exiting try");
        }
        //student ko best exception
        try {
            int numb1 = 10;
            int numb2 = 10/0;
            String data3 = null;
            System.out.println(data3.length());
            int[] intArr10 = new int[10]; 
            intArr10[20] = 100;
        } catch (Exception ex) {
            System.out.println("I catch any expection");
        }
       // throwExample(10);
       try{
        enssureException();// to run this function, must be inside try catch
       }catch(Exception ex){
        System.out.println("Exception");
       }
        System.out.println("Program stop");

        // Task
        // Find the exception and use try block finally accordingly
        // int number1 = 10;
        // int number2 = number1 - 10;
        // int number3 = number1 / number2;
        // String name;
        // System.out.println(name.length());
        // String[] names = new String[100];
        // names[0] = "Ram";
        // names[110] = "Oskar";
        //
        try {
            int number1 = 10;
        int number2 = number1 - 10;
        int number3 = number1 / number2;
        String name = null;
        System.out.println(name.length());
        String[] names = new String[100];
        names[0] = "Ram";
        names[110] = "Oskar";
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }catch (NullPointerException e) {
            System.out.println("Null Error");
        }catch (Exception ex) {
            System.out.println("Catch any Error");
        }finally{
            System.out.println("Execute whether exception occured or not");
        }
    }
    static void throwExample(int num){
        if(num< 18){
            //manually throw an exception
            throw new ArithmeticException("Not eligible");
        }
    }
    static  void enssureException() throws Exception{
        System.out.println("To run this must wrap in try catch");
    }
    
}
        
