import java.util.*;

public class arrayHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = 0;
                //to push the elements we have used linked list here 

        ArrayList<Integer> sumarr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j+1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                sumarr.add(sum);
            }
        }

        System.out.println(Collections.max(sumarr));

    }

}