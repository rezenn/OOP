public class jumpStatement {
    public static void main(String[] args) {
        /* break and continue aare jump statement in java 
         * break will terminate the loop
         */
        for (int index=0 ; index<5 ; index++){
            if(index ==3 ){
                break; //this line will break the loop scope
            }
            System.out.println("Index"+ index);
        }
        /*can be used in any loop  */
        int count=0;
        while (count <= 10) {
            if(count == 1){
                break;
            }
        System.out.println("count"+count);
        count++;
    }
    /*continue statementr will skip the loop */
    for(int index =0; index<5;index++){
        if(index==3){
            continue;
        }
        System.out.println("continue index"+ index);
    }
    /*task wap to run for loop from -5 to 5
     * break the loop if index is +ve
     * 
     * loop from 1 to 20 using any loop only print the value if its even
     * use continue to do this task
     */

     for(int num = -5;num <6; num++){
         if(num>=0){
            break;
        }
        System.out.println("loop no "+ num);
     }
     for(int number =1; number<21; number++){
        if(number % 2 ==0 ){
            System.out.println("the no is "+ number);
        }
        else{
            continue;
        }
     }

    }
    
}
