package DAY62;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashset 
{

    public static void main(String[] args) {

        HashSet  hs = new HashSet ();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < numCases;i++){
            if(hs.add(sc.nextLine())){
                count++;
            }
            System.out.println(count);
        }
        
    }
}
