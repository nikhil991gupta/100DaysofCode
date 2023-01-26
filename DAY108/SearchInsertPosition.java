package DAY108;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        //int mid=(low+high)/2;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //        if( nums[i]==target)
    //        {
    //         return i;
    //     }
    //     else if(num[i]>nums[mid])
        
    // }
    // return mid;
   while(low<=high)
        {
            int mid=(high+low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
               // return 1;
        
            }
            else  high=mid-1;


        }
        return low;
    }
}
