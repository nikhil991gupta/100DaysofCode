public class Solution {
    public static void main(String[] args) throws IOException {
               // int sc;
 
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt(); 
        }
        for (int i = 0; i < n; i++){
            System.out.print(array[n-i-1] + " ");
        }
    
}
