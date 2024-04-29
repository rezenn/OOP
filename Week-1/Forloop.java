public class Forloop {
    public static void main(String[] args) {
        /*use for loop when condition is fixed */
        for(int index = 0; index < 5; index++){
            System.out.println("loop is rrunning" + index);
        }
        /*decrement loop */
        for(int index = 10; index >=0; index --){
            System.out.println("loop is running   " +index);
        }

        /*task
         * make a multiplication table of 2
         * 2 x 1 = 2
         * .
         * .2 x 10 = 20
         * note= initilization=1
         * condition <=10 or < 11
         * increament +=
         */

         for(int index = 1; index < 11; index ++){
            System.out.println("2 x "+ index +" = "+ index*2);
         }
         /* nested loop */
         for(int outer =0; outer < 3; outer ++){
            for(int inner = 2; inner >= 0; inner --){
                System.out.println("inner "+ inner);
            }
            System.out.println("outer "+outer);
         }

         /* task use nested loop to do the following
          * make multiplication ntable from 1 -10
          eg
          multipl,ication of 1
          1 x 1 = 1
          .
          .
          1 x 10 = 10
          .
          .
          multipl,ication of 10
          10 x 10 = 10
          .
          .
          10 x 10 = 100
          */

          for(int index = 1; index < 11; index ++){
            for(int index2 = 1; index2 < 11; index2 ++){
                System.out.println(index+" x "+ index2 +" = "+ index2*index);
            }
            }
           
    }
    
}
