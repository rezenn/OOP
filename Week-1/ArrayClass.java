public class ArrayClass {
    public static void main(String[] args) {
        /*to create an array define datatype followed by [] */
        int[] myFirstArray;
        /*initializing the array we need new refernce */
        myFirstArray = new int[6];// here the new int[6] ->refers to the size of array.,
        /*the size of the array can be further accesss by length */
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My first array size is "+ myFirstArrayLength);

        /*using index for array operation */
        myFirstArray[0] = 10;
        myFirstArray[1] = 21;
        myFirstArray[2] = 12;
        myFirstArray[3] = 23;
        myFirstArray[4] = 12;
        myFirstArray[5] = 10;
         /* to print the aRRAY USE THE SAME index */
         System.out.println("The first element is in 0 index "+ myFirstArray[0]);
         /*can also create a new int value */
         int secondArrayIndex = myFirstArray[1];
         System.out.println("The second array is "+secondArrayIndex);

         /*Declaration and initization */
         int[] mySecondArray = new int[6];
         /*declaration, intialization and value assign */
         int[] myThirdArray = {10, 20, 30, 100};
         /* or using constuctor */
         int[] myFourthArray = new int[]{1, 2, 3};


         /*task
          * create a array of int called myFifthArray
          with size of 5
          insert the value of 10, 20, 30 ,40 ,50
          print the value of an array as well as the multiple by 2
          eg:
           10 20 
           20 40
           30 60
           40 80
           50 100 
          */
         
          int[] myFifthArray = {10, 20, 30 ,40 ,50};
            for(int i= 0; i<myFifthArray.length;i++){
                int mul = myFifthArray[i]*2;
                System.out.println("the multiple of "+myFifthArray[i]+" is "+ mul);
            
        }

    }
    
}
