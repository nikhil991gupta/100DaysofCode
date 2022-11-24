package DAY45;

import java.io.*;
import java.util.*;

public class endoffile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int No = 0;
        while(sc.hasNext()){
            No++;
            System.out.println(""+No+" "+sc.nextLine());
        }
    }
}