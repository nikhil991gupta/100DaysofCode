package DAY129;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int[] c=new int[a+b];
        int i=0,j=0,k=0;
        while(i<a && j<b)
        {
            if(nums1[i]<nums2[j])
            {
                c[k]=nums1[i];
                i++;
            }
            else{
                c[k]=nums2[j];
                j++;
            }
             k++;

        }

            while(i<a)
            {
                 
                c[k]=nums1[i];
                k++;
                i++;
            }
            
             while(j<b)
              {
                c[k]=nums2[j];
                k++;
                j++;

            }

            
            if((a+b)%2==0)
            {
                int x=(a+b)/2;
                double p=c[x];
                double q=c[x-1];
                return (p+q)/2;

                
            }
            else{
               return c[(a+b)/2];


            }
    }
}





// double sum1=0,sum2=0,sum3=0;
        // if(a%2==0 || b%2==0)
        // {
        // for(int i =0;i<a;i++)
        //     sum1+=nums1[i];

        
        //  for(int j =0;j<b;j++)
        //     sum2+=nums2[j];

        
        // sum3=(sum1+sum2)/(a+b);
        // return sum3;
        // }
        // else{
        //     for(int i =1;i<a-1;i++)
        //     sum1+=nums1[i];

        
        //  for(int j =1;j<b-1;j++)
        //     sum2+=nums2[j];

        
        // sum3=(sum1+sum2)/((a+b)/2);
        // return sum3;