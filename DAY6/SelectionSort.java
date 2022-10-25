import java.util.Scanner;

class SelectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("Enter Size");
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
            {
            arr[i]= in.nextInt();
        }

        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array Element");

        printArray(arr);
    }
}