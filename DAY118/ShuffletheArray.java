package DAY118;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] n1 =new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            if(i%2==0)
            {
                n1[i]=nums[i/2];
            }
            else{
                n1[i]=nums[n+i/2];
            }
        }
        return n1;
    }
}