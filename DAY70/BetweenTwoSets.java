package DAY70;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = in.nextInt();
        }
        
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            boolean ok = true;
            for (int j = 0; j < n && ok; j++) {
                if (i % A[j] != 0) ok = false;
            }
            for (int j = 0; j < m && ok; j++) {
                if (B[j] % i != 0) ok = false;
            }
            if (ok) cnt++;
        }
        System.out.println(cnt);
    }
}