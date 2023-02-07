package DAY119;

// class Solution {
//     public int climbStairs(int n) {
//         int memo[] = new int[n+1];
//         int ans = rec(n, memo);
//         return ans;
//     }
    
//     private static int rec(int n, int memo[]){
//         if(n <= 1) return 1;
//         if(memo[n] > 0) return memo[n];
//         int op1 = rec(n-1, memo);
//         int op2 = rec(n-2, memo);
//         memo[n] = op1 + op2;
//         return  op1 + op2;
//     }
// }
//class ClimbingStairs {

//   public int climbStairs(int n) {

//     if (n == 1) return 1;

//     int[] dp = new int[n + 1];
//     dp[1] = 1;
//     dp[2] = 2;

//     for (int i = 3; i <= n; i++) {
//       dp[i] = dp[i - 1] + dp[i - 2];
//     }

//     return dp[n];
//   }

// }


class Solution {
    public int climbStairs(int n) {
          if(n==1)    
          return 1;
    
         int[] arr=new int[n+1];
    //int arr1=0;
             arr[1]=1;
              arr[2]=2;
  
  
        for(int i =3;i<=n;i++)
        {
            arr[i]= arr[i-1] + arr[i-2];
        }


    return arr[n];

    }
}