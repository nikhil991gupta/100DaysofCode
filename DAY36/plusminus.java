package DAY36;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class plusminus {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int positive = 0;
int zero = 0;
int negative = 0;
for (int i = 0; i < n; i++) {
int x = in.nextInt();
if (x > 0) {
positive++;
} else if (x == 0) {
zero++;
} else {
negative++;
}
}
System.out.println(positive / (double) n);
System.out.println(negative / (double) n);
System.out.println(zero / (double) n);
}
}
