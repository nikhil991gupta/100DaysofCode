import java.util.Scanner;
public class BinarySearch {
    void LinearSearch(int n , int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to search : ");
        int key = sc.nextInt();
        int lo = 0;
        int hi = n;
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(arr[mid] == key){
                System.out.println("The number "+ key+" is Found at "+mid+" Position.");
                return;
            } else if (arr[mid] < key) {
                lo = mid + 1;
            } else if (arr[mid] > key) {
                hi = mid - 1;
            }

        }
        System.out.println("Elemeny not found");
    }
}
class BinarySearch1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BinarySearch DB = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array : ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Invalid Input");
        } else {

            int arr[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                System.out.print("No. " + i + " ");
                arr[i] = sc.nextInt();
            }
            DB.LinearSearch(n, arr);
            long end = System.currentTimeMillis();
            long elapsedTime = end - start;
            System.out.println("Your execution time is :" + (elapsedTime / 1000) + "Sec");
        }
    }
}