import java.util.Scanner;

public class Maxsumsubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        maxsum(arr, n, k);
    }

    public static void maxsum(int[] arr, int n, int k) {
        int max = 0;
        for (int i = 0; i < n - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum = sum + arr[i + j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}