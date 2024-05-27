public class multidemensionalArray {
    public static void main(String[] args) {
        /*create N-dimensional array add number of square bracket */
        /*1 D array */
        int[] oneDArray;
        /*2D array */
        int[][] twoDArray;
        /*3D array */
        int[][][] threeDArray;

        /*Allocating memory size */
        twoDArray = new int[3][5];
        /*first size 3 represent how many innerarray
         * seond size 5 represent how many va;lues in inner array
          [
          [0,0,0,0,0],  -> 0
          [0,0,0,0,0],  -> 1
          [0,0,0,0,0]   -> 2
          ]
        */
          
        /* to take the first inner array use index */
        // twoDArray[0];
        /*to take the value in first inner array use internal index */
        // twoDArray[0][0] = 10 ;
        // twoDArray[0][1] = 20 ;
        // twoDArray[1][2] = 100;
        // twoDArray[2][4] = 200;
        /* fill the array like the following
         * [10,20,30,40,50],
         * [80,90,100,110,120],
         * [150,160,170,180,200]
         */
        twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[0][2] = 30;
        twoDArray[0][3] = 40;
        twoDArray[0][4] = 50;

        twoDArray[1][0] = 80;
        twoDArray[1][1] = 90;
        twoDArray[1][2] = 100;
        twoDArray[1][3] = 110;
        twoDArray[1][4] = 120;

        twoDArray[2][0] = 150;
        twoDArray[2][1] = 160;
        twoDArray[2][2] = 170;
        twoDArray[2][3] = 180;
        twoDArray[2][4] = 200;
    /* now print the 1th index array like
     * array in 1th index
     * 80
     * 90
     * 100
     * 110
     * 120
    */
   
    System.out.println(twoDArray[1][0]);
    System.out.println(twoDArray[1][1]);
    System.out.println(twoDArray[1][2]);
    System.out.println(twoDArray[1][3]);
    System.out.println(twoDArray[1][4]);
    
    /*multi Dim array memory alloc and assignment */
    int[][] arrayTwo = {
        {10,20,30},
        {20,30,40},
        {100,200,300},
        {3,4,5}
    };














    }
    
}
