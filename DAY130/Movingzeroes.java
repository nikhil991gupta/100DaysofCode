package DAY130;

class Solution {
    public void moveZeroes(int[] nums) {
        int ins=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[ins]=nums[i];
                ins++;
            }
        }
        while(ins<nums.length)
        {
            nums[ins]=0;
            ins++;
        }
        
    }
}