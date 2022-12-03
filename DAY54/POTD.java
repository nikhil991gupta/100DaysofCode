class Solution {
    public static boolean isPossible(int[] stalls , int n , int cows , int minDist){
        int cntCows = 1;
        int lastPlacedCow = stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-lastPlacedCow >= minDist){  
                cntCows++;
                lastPlacedCow = stalls[i];
            }
        }
        if(cntCows >= cows) return true;
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1]-stalls[0];
        while(low<=high){
            int mid = (low+high)>>1;
            if(isPossible(stalls , n , k , mid))    low = mid + 1;
            else    high = mid - 1;
        }
        return high;
    }
}