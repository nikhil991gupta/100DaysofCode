package DAY123;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    
     for(int i=0;i<nums.length;i++)
      {
            for(int j=i+1;j<nums.length;j++)
        {
            int no=target-nums[i];
            if(no==nums[j])
            {
                return new int[]{i,j};
            }
        }
      }
      throw new IllegalArgumentException("Not Found");
    }
}
