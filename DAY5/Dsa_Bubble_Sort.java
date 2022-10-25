import java.util.Scanner;
public class Dsa_Bubble_Sort {

    int[] BubbleSort(int arr[],int n){
        for(int i =1 ; i <= n-1 ; i++){
            for(int j = n ; j >= i+1 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    void PrintArray(int arr[]){
        for(int i = 1; i<= arr.length-1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class Dsa_BubbleSort_Exe{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for(int i = 1 ; i <= n; i++){
            System.out.print("Enter the value. "+ (i) +" ");
            arr[i]=sc.nextInt();
        }

        Dsa_Bubble_Sort DB = new Dsa_Bubble_Sort();
        DB.PrintArray(DB.BubbleSort(arr, n));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("\n");
        System.out.println("Time for execution: "+elapsedTime+"millis");
    }
}