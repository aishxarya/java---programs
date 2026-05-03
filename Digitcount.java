import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        display(n);
    }

    public static void display(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
