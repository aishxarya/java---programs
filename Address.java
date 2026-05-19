import java.util.Scanner;

class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String Address = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("Name:" + name + ", Address:" + Address + ", Age:" + age);
    }
}