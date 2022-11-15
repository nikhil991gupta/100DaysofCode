package DAY37;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int n=arr.size();
    long[] myList = new long[n];
    for(int i=0;i<n;i++){
    myList[i] = (long)arr.get(i);
    }
    for(int p=0;p<=n-1;p++){
        for(int q=p+1;q<=n-1;q++){
            long temp=0;
            if(myList[p]>myList[q]){
                temp=myList[p];
                myList[p]=myList[q];
                myList[q]=temp;
            }
        }
    }
    long sum=0;
    for(int i=0;i<=n-1;i++){
        sum+=myList[i];
    }
    long h=sum-myList[0];
    long l=sum-myList[n-1];
    System.out.println(l+" "+h);
    }

}
public class minimax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
