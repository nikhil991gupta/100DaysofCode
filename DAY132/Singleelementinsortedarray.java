class Solution {
    public int singleNonDuplicate(int[] nums) {
       //  int j=1;
        for(int i=1;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i-1])
            {
                //nums[j]=nums[i];
               // j++;
               return nums[i-1];
            }
          
          
        }
        return nums[nums.length-1];
        
    }
}