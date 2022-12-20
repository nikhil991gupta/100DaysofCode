package DAY71;

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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
// Write your code here
    int highscore=scores.get(0);
    int lowscore=scores.get(0);

    int breakingHighScore=0;
    int breakingLowScore=0;

    for(int i=0; i<scores.size(); i++){
        if(scores.get(i)>highscore){
            highscore = scores.get(i);
            breakingHighScore++;
        }else if(scores.get(i)<lowscore){
            lowscore = scores.get(i);
            breakingLowScore++;
        }
    }
    List<Integer> final_result = new ArrayList<>();
    final_result.add(breakingHighScore);
    final_result.add(breakingLowScore);

    return final_result;
}

}

public class BreakingtheRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
