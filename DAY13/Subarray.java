package DAY13;

import java.util.*;
public class Subarray {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,sum=0,count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                   
                }
                 if(sum<0)
                 {
                     count++;
                 }
            }
        }
        System.out.print(count);
    }
    
}

    
}
