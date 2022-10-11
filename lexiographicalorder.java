import java.util.Scanner;

public class lexiographicalorder {


    public static String getSmallestAndLargest(String s,int k) {
        
    String start = "";
    String end = "";
    start = end = s.substring(0, k);
    //start=0,end=k(user input)

    for (int i=1; i<s.length()-k+1; i++) {
        String substr = s.substring(i, i+k);
        if (start.compareTo(substr) > 0)
            start = substr;
        if (end.compareTo(substr) < 0)
            end = substr;
    }

    return start + "\n" + end;
}
        

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}