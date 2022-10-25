import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
      
       // String Pattern;

      Scanner in = new Scanner(System.in);
      int n = Integer.parseInt(in.nextLine());
      while(n>0){
         n--;
         String pattern = in.nextLine();
         try{
            Pattern.compile(pattern);
            System.out.println("Valid");
         }
         catch(PatternSyntaxException e){
            System.out.println("Invalid");
         }
         
    }
    
    }
    }