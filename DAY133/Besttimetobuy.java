class Solution {
    public int maxProfit(int[] prices) {
        int k=prices.length;


        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<k;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else if(prices[i]-min>max)
            {
                max=prices[i]-min;

            }
        }
        // int min=prices[0];
        //     int min1=prices[prices.length-1];

        // int i;
        // for( i=0;i<k;i++)
        // {
        //     if(min>prices[i])
        //     {
        //         min=prices[i];
        //     }
        //     while(i<k)
        //     {
        //      if(min1<prices[i])
        //     {
        //         min1=prices[i];
                
        //     }
        //      return (min1 - min);

        //     }

        // }
        // return -1;
    return max;
    }
}