public class arrayLoop {
    public static void main(String[] args) {
        int[]data ={10,20,30};
        int arrayLength = data.length;
        /* first appoach */
        for(int index = 0; index < arrayLength; index++){
            System.out.println("Index "+index+" Value "+data[index]);

        }
        System.out.println("Using length - 1");
        /* Second approach */
        for(int index = 0; index <= arrayLength-1; index++){
            System.out.println("Index "+index+" Value "+data[index]);
        }
        //data[103]; this will crash, no index accessible
        /*task
         * make an array of length 10
         * add value of 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 
         * make another array with the same length 10
         * add the value of first array in negative onto second array
         * use loop on first array to complete this
         * second array should be -10, -20, -30, -40, -50, -60, -70, -80, -90, -100 
         * print the second array
         */
        int[] firstArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] secondArray = new int[10];
            for(int i=0; i<firstArray.length;i++){
                secondArray[i] = -firstArray[i];
                System.out.println(secondArray[i]);
            }
            /* task
             * printbthe second array in descending order
             * should be -100, -90, -80, -70, -60, -50, -40, -30, -20, -10
             */

            for(int i=secondArray.length-1; i>=0;i --){
                System.out.println(secondArray[i]);

            }
    }
    
}
