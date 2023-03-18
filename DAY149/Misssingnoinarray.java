package DAY149;


class Solution {

    int MissingNumber(int array[], int n) {

        // Your Code Here

        int sum=0;

        int sumarr=0;

        for(int i=1;i<=n;i++)

        {

           sum=sum+i;

           

        }

        for(int i=0;i<array.length;i++)

        {

            sumarr=sumarr+array[i];

        }

        return sum-sumarr;

    }

}