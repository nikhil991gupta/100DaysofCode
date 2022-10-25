import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyRegex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String zeroTo255
            = "(\\d{1,2}|(0|1)\\"
              + "d{2}|2[0-4]\\d|25[0-5])";
              
        String regex
            = zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255 + "\\."
              + zeroTo255;
        Pattern pattern = Pattern.compile(regex);
        while(scanner.hasNext()) {
            String ipAddress = scanner.nextLine();
            Matcher matcher = pattern.matcher(ipAddress);
            System.out.println(matcher.matches() ? "true" : "false");
    }

    }
}
