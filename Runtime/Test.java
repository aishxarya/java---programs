import java.util.Scanner;
 class MyException extends Exception {
    MyException(String msg){super(msg);}
}
public class Test {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(str.length() < 5) {
            throw new MyException("Custom error");
        }
        System.out.println("You entered: " + str);
        sc.close();
    }
}