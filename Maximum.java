import java.util.Scanner;
public class Maximum{
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        max(a,b,c);
    }
    public static void max(int a,int b,int c){
        int output = (a>b)?((a>c)? a:c) : ((b>c)? b:c);
        System.out.println(output);
    }
}