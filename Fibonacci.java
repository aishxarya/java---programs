import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]  args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        nterms(n);
    }
    public static void nterms(int n){
        int a=0;
        int b=1;
        if(n==1)
            System.out.print(a);
        else if(n==2)
            System.out.print(a+ " "+b);
        else{
            System.out.print(a+" "+b+" ");
            for(int i=1; i<=n-2; i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
