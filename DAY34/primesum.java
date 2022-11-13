package DAY34;

class Solution {
    static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0) 
                return false;
        }
        return true;
    }
    static String isSumOfTwo(int N){
        for(int i=1; i<=N/2; i++){
            if(isPrime(i) && isPrime(N-i)) 
                return "Yes";
        }
        return "No";
    }
}