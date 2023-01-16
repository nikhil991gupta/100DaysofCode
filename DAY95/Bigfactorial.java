package DAY95;

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
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
public static void extraLongFactorials(int n) {
    BigInteger answer = new BigInteger("1");
    while (n != 0) {
        answer = answer.multiply(BigInteger.valueOf(n));
        n--;
    }
    System.out.println(answer);
}
    

}
public class Bigfactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
       
        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
