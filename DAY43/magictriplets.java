package DAY43;


class magictriplets{
    public int countTriplets(int[] a){
        int n=a.length;
      int count=0;
      for(int i=1;i<n;i++){
          int s=0;
          int l=0;
          for(int j=0;j<i;j++){
              if(a[j]<a[i]) s++;
          }
          for(int k=i+1;k<n;k++){
              if(a[k]>a[i]) l++;
          }
          count+=s*l;
      }
      
      return count;
    }
}