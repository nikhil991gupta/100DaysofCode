package DAY102;

class Solution {
    public int pivotIndex(int[] nums) {
       
       int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int  leftsum=0;
      // int rightsum=0;
       for(int i=0;i<nums.length;i++)
       {
        if(i!=0)
        {
        leftsum+=  nums[i-1];
        }
        if(sum-leftsum-nums[i]==leftsum)
        {
            return i;
        }
    }
    //    {
    //        rightsum=sum-nums[i]-leftsum;
    //     if( rightsum==leftsum)
    //     {
    //         return i;
    //     }
       
        //return i;

        
     //  }




       return -1; 
        
    }
}