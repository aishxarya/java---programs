import java.util.Scanner;
public class Maxmin{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        display(arr);
    }
    public static void display(int[] arr,int n){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}