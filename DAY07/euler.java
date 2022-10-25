import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class euler {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
                int[] arr=new int[t];

       for(int i=0;i<t; i++)
       {
          arr[i]=in.nextInt();
       }
        for(int i=0;i<t; i++)
       {
               int sum=0;

            for(int j=0;j<arr[i]; j++)
           if(j%3==0 || j%5==0)
           {
               sum+=j;
           }
               System.out.println(sum);

       }
    }
}
