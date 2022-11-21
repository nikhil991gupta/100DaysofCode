class Geeks {

    public long count(int n) {
        long dp[]= new long[n+1];
        dp[0] = 1;
        for(int i=1; i<dp.length; i++){
            dp[i] = 0;
        }
        int [] arr= new int[]{3, 5, 10};
        for(int i=0; i<3; i++){
          for(int j=arr[i]; j<dp.length; j++){
           dp[j] = dp[j] + dp[j-arr[i]];

            }

        }
       return dp[n];
     }
    }