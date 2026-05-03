import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();
        search(arr, n, key);
    }

    public static void search(int[] arr, int n, int key) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element " + key + " found at index " + index);

        }
    }
}