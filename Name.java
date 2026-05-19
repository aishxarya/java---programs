
import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();

        System.out.println("Name: " + name + ", Age: " + age);
    }
}