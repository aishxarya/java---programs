import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        display(n);
    }

    public static void display(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
