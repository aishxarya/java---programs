import java.util.Scanner;
public class Days{
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        display(n);
    }
    public static void display(int n){
        switch(n){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Print days from 1 to 7");
            break;
        }

        }

    }