package DAY44;

class Solution {
    static long maxSumLCM(int n) {
       // code here
       long sum=0;
       for(int i=1;i*i<=n;i++){
           if(n%i==0){
               if(i==(n/i)){
                   sum+=i;
               }
               else{
                   sum+=(i+n/i);
               }
           }
       }
       return (long)sum;
   }
}