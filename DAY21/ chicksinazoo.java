//User function Template for Java

// DAY1=1=1
// DAY2=1 1 1=3
//DAY3= DAY2 + 2* DAY2=9
//DAY4= DAY3+ 2*DAY3=27
//DAY5= DAY4+ 2*DAY4=81
//DAY6= DAY5+ 2*DAY5=243
//DAY7= (DAY6-DAY1)+ (2*DAY6-DAY1)=242+2*242=726


class chicksinazoo
{
   public long NoOfChicks(int N)
    {
         long count=1;
        //long ans=1;
        long arr[]=new long[50];
        //boolean flag=false;
        arr[6]=1;
        //int ind=0;
        for(int i=1;i<N;i++){
            count-=arr[i];
            arr[i+6]=2*count;
            count+=2*count;
            }
            return count;
            // long val=ans*2;
            // arr[i]=val;
            // ans+=val;
        }
       // return ans;
    }
    
