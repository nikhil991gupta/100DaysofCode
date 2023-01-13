package DAY94;
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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

public static String pangrams(String s) {
                 String l=s.toLowerCase();  
                 Set<Character> set=new HashSet<>();
                        for (int i = 0; i < l.length(); i++) {
                                if ( !Character.isWhitespace(l.charAt(i)) ) {
                                set.add(l.charAt(i));
                        }
                        }
                        if (set.size()==26) {
                                return "pangram";
                        }
                        return "not pangram";

                }


}

public class pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
