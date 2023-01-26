package DAY107;
import java.util.*;;
//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
       Arrays.sort(A);
              Arrays.sort(B);

             for(int i =0;i<N;i++)
        
        {
            if(A[i]!=B[i])
            {
                return false;
            }
            
        }
            
        
        return true;
    }
}