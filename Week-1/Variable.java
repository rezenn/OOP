public class Variable {
    /* instance variable 
     * will need object to access this variable
     * will not be shared between object
    */
    int instanceVariable = 100;
    /*static / class variable
    *no need of object , can be called from class
    *shared between the objects 
    */ 
    static int staticVariable = 20;

    public static void main(String[] args) {
        /*non Primitive data type */
        /*declartion */
        byte byteValue;
        /*initialization */
        byteValue = 100;
        /*declaration and initialization */
        short shortValue = 200;
        /*multiple declaration */
        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        /*multiple declation and initialization */
        long longVal1 =-9000, longVal2 = 9000;
        float floatValue = 90.90f; // the letter 'f' is needed
        double doubleValue = 100.1131d; // the letter 'd' is needed
        char charValue = 'c'; // must use single quote and one letter only
        boolean booleanValue = false;
        /* illegal action below */
        //byte byteValue = 100; //we cannot redeclare the variable
        //byteVaule = 200; // instead use reassignment
        //boolean boolVal2 = 'false'; //cannot use different type, no single quote
        // byte byteValue2 = 100000000; // cannot exceed max and min
        /* Non primative data type */
        String stringValue2 = new String("This string uses class");
        System.out.println(stringValue2);
        /* object for this we can use the same public class made */
        Variable variableObject = new Variable();
        /* use object from above to access instance variable */
        System.out.println(variableObject.instanceVariable);
        /*use class to use static variable */
        System.out.println(Variable.staticVariable);
        /* type casting */
        int intValueType = 100;
        double intValueConversionToDouble = intValueType;
        /*automatically cast fro low datatype to high datatype */
        
        /*explicit casting */
        double doubleValuetype = 190.8100;
        int intValueConversionToInt =(int) doubleValue;
        /* manually specify data type for eg: (int) 
         * note this type cast can only be done in primitive datatype
        */

        /*task
         * make one double variable called doubleVar1 = 100.12
         * explicitly cast the variable into float, floatVar1
         * explicitly cast the floatVar1 into int, intVar1
         * make a string variable with "the integer is"
         * print the string variable and print  the intVar1
         */

         double doubleVar1= 100.12;
         float floatVar1 =(float) doubleVar1;

         int intVar1 = (int) floatVar1;

         String stringVal1 = new String("The integer is");
         System.out.println(stringVal1);
         System.out.println(intVar1);

    }
    
}
