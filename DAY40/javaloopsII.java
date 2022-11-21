package DAY40;

import java.util.*;
import java.io.*;

class javaloopii{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int calc = a;
            for(int j=0;j<n;j++)
            {
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
/* 

........................................................
Compiler Message
Success
Input (stdin)

Download
2
0 2 10
5 3 5
Expected Output

Download
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
........................................................

*/