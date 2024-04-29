public class JavaArgument {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Not enough args");
            return;
        }
        System.out.println("first arg is "+ args[0]);
        System.out.println("second args is "+args[1]);
        // convert string into integer/ must pass number in 2nd args
        int argInt = Integer.parseInt(args[1]);
        
    }
    
}
