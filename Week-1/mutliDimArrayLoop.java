public class mutliDimArrayLoop {
    public static void main(String[] args) {
         /*Creating an array with [4][2] */
         int[][] arr = new int[4][2];
         arr[0][0] = 10;
         arr[0][1] = 20;
         arr[1][0] = -10;
         arr[1][1] = -20;
         arr[2][0] = 100;
         arr[2][1] = 200;
         arr[3][0] = -100;
         arr[3][1] = -200;
         /*visual representation
          * [10,20],
          * [-10,-20],
          * [100,200],
          * [-100,-200]
          */
         /*loop outer loop */
         int outerLength = arr.length; //->4
         for(int outer = 0; outer < outerLength; outer++){
             System.out.println("array in index "+ outer);
              System.out.println(arr[outer][0]);
              System.out.println(arr[outer][1]);
             int innerArrayLength = arr[outer].length; 
             for(int inner =0; inner < innerArrayLength; inner++){
                 System.out.println(arr[outer][inner]); // inner loop from 0,1
             } 
         }

         /* make an array of string names
          * [
          * ["Sanskriti","Nikita","Anji"],
          * ["Miraj","Niraj","Oskar"]
          * ]
          * 
          * loop each names
          * task 2 on the same loop, the on which array is Oskar in
          * answer should be 1
          * String [][] names = new String[2][3];
          */
        String[][] names = new String[2][3];
        names[0][0] = "Sanskriti";
        names[0][1] = "Nikita";
        names[0][2] = "Anji";
        names[1][0] = "Miraj";
        names[1][1] = "Niraj";
        names[1][2] = "Oskar";

        int outLen = names.length;
        int innLen = names[outLen].length;
        for(int i=0; i<outLen;i++){
            for(int j=0; j<innLen;j++){
                if(names[i][j] =="Oskar"){
                    System.out.println("Oskar is in index "+ i+" and "+j);
                }
            }
        }


    }
    
}
