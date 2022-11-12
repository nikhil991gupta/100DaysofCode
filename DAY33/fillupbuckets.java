package DAY33;

import java.util.*;

class fillupbuckets{
    public int totalWays(int n, int[] capacity) {
        // code here
        Arrays.sort(capacity);
        long k = 1;
        for(int i=0;i<n;i++){
            k=(k*(capacity[i]-i))%1000000007;
        }
        return (int)k;
    }
}