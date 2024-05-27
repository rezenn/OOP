public class new {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList;

class Result {

    /*
     * Complete the 'product' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static List<Integer> product(List<Integer> ar) {
    // Write your code here
       int n = ar.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];
        
        left[0] = 1;
        right[n-1] = 1;
        
        for(int i=0;i<n;i++){
            left[i] = ar[i] * left[i-1];
        }
        for(int i = n-2; i>=0; i--){
            right[i] = ar[i+1]*right[i+1];
        }
        for(int i=0;i<n;i++){
            prod[i] = left[i] * right[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(prod[i]);
        }
        return;
    }

    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.product(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    
}
