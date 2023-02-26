class Solution {
    public int[][] generateMatrix(int n) 
    {
        int[][] arr=new int[n][n];
		boolean a=true;
		boolean b=false;
		int i=0;
		int j=0;
		int q=0;
		int p=-1;
		int r=n;
		int s=n;
		int count=0;
		while(i<n&&j<n&&count<n*n)
		{
			count++;
			
			if(a==true&&b==false)
			{
				arr[i][j]=count;
				j++;
				if(j==r)
				{
					j--;
					i++;
					a=false;
					r--;
				}
			}
			else if(a==false&&b==false)
			{
				arr[i][j]=count;
				i++;
				if(i==s)
				{
					j--;
					i--;
					b=true;
					s--;
				}
			}
			else if(b==true&&a==false)
			{
				arr[i][j]=count;
				//System.out.print("(i:"+i+" j:"+j+") ");
				j--;
				if(j==p)
				{
					i--;
					j++;
					a=true;
					p++;
					
				}
			}
			else if(b==true&&a==true)
			{
				arr[i][j]=count;
				i--;
				if(i==q)
				{
					i++;
					j++;
					b=false;
					q++;
				}
				
			}
		}
        return arr;
    }
}