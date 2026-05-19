import java.util.Scanner;

class Department {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String dept = s.nextLine();
        double Score = s.nextDouble();
        System.out.println("My name is Vikram");
        System.out.println("My dept is Biology");
        System.out.println("My score is " + Score / 10 + "/10");
    }

}
