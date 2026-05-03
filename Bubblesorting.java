import java.util.Scanner;

public class Bubblesorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr, n);
    }

    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean var = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    var = true;

                }
            }
            if (var == false)
                break;
        }
        // display
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}