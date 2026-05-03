import java.util.Scanner;
public class Number{
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt(); //n=7
        display(n);
    }
    public static void display(int n){
    if(n>0){
        System.out.println("positive");
    } 
    else if(n>0){
        System.out.println("negative");
    }
    else{
        System.out.println("zero");
    }
  }
}