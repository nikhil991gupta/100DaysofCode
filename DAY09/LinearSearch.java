import java.util.*;
public class LinearSearch {
    void LinearSearch(int n, int arr[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number that you want to search : ");
        int key = sc.nextInt();
        int i = 1;
        if (key == 0) {
            System.out.println("Inavlid Input");
        } else {
            while (i <= n && arr[i] != key) {
                i++;
            }
            if (i <= n) {
                System.out.println("THe Value " + key + " is Found at " + i + " Position.");
            } else {
                System.out.println("Your Number Is Not In The List.");
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
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
            LinearSearch DL = new LinearSearch();
            DL.LinearSearch(n, arr);
            long end = System.currentTimeMillis();
            long elapsedTime = end - start;
            System.out.println("Your Execution Time Is :" + (elapsedTime / 1000) + "Sec");
        }
    }
}