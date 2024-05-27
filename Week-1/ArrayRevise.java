public class ArrayRevise {
    public static int arrayFinder(String[] arr, String find ){
        for(int i = 0; i< arr.length; i++){
            if( arr[i] == find){
                return i;
            }
        }
                return -1;

    }  
    public static int[] addToArray(int[]arrayInt, int value){
        int[] newArrayInt = new int[arrayInt.length];
        for(int i = 0; i < arrayInt.length; i++){
             newArrayInt[i] = arrayInt[i]+value; 
        }
        return newArrayInt;
    }  
    public static void main(String[] args) {
        /*3 ways to create array */
        int[] arrayOne;
        arrayOne = new int[2]; //[0,0]
        int[] arraytwo = new int[2]; //[0,0]
        int[] arrayThree = {2, 3,5,7,8}; //[2,3,5,7,8]

        System.out.println(arrayThree[4]);
        arraytwo[1] = 200;

        /*looping an array */
        int arrayThreeLength = arrayThree.length;
        for(int index = 0; index < arrayThreeLength; index++){
            System.out.println("Index: "+index+" Value: "+ arrayThree[index]);
        }
        /* or loop from 0<= arrayThreeLength-1 */

        String[] names = {"Ram","Jhon","Shyam","Doe"};
        String finder = "Shyam";
        /*Loop names and find the index of Shyam */
        int strLength = names.length;
        for(int i = 0; i< strLength; i++){
            if (names[i] == finder){
                System.out.println("The index is "+i);
                break;
            }
            /*make a function  named arrayFinder
             * that takes array of string and String finder
             * return the index if found else -1
             */
        }
        String[] arr = {"ram","jhon","shon"};
        String find = "ram";
        int send = arrayFinder(arr,find);
        System.out.println("The inex is "+send);
        /* make a function addToArray
         * that takes array of int, int value
         * loop array of int and add the value to each element
         * return array of int of new value
         * eg: [1,2,3,4,] ,10
         * returns [11,12,13,14] 
         */
        int[] arrayInt = {2, 3,5,7,8};
        int value = 13;
        int send2 = addToArray(arrayInt, value);
        System.out.println(send2); 
        /* make a function reverseArray
         * takes array of int
         * return new array of reversed index
         * eg: [1,2,3,4,5,6]
         * return [6,5,4,3,2,1]
         */
    }
    
}
