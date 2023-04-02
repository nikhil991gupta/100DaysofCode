class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=potions.length;

        int[] ans=new int[spells.length];
                Arrays.sort(potions);

        for(int i=0;i<spells.length;i++)
        {
            int spell=spells[i];
            int low=0;
            int high=n-1;
            //int count =0;
            while(low<=high)
            {
            int mid =low+(high-low)/2;
            long product=(long)spell*potions[mid];
            if(product>=success)
            {
                //count+=high-mid+1;
                high=mid-1;

            }
            else
            {
                low=mid+1;
            }

            }
            ans[i]=n- low;
        }
        return ans;
        
    }
}


