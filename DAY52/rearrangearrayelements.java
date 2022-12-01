package DAY52;


class rearrangearrayelements{


    public static void rearrange(long arr[], int n){

        int mini=0;

        int max=n-1;

        long max_ele=arr[n-1]+1;

        long me=max_ele;

        for(int i=0; i<n; i++){

            if(i%2==0){

                arr[i]= arr[i]+arr[max]%me*me;

                max--;
            }
            else{
                arr[i]= arr[i]+arr[mini]%me*me;
                mini++;
            }

        }
        for(int i=0; i<n; i++){

            arr[i]= arr[i]/me;

        }

    } 

}

 
    



