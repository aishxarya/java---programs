import java.util.*;
public class Lab{
    public static void main(String[] args){
        Stack<String> stk=new Stack<>();
        stk.push("REE");
        stk.push("VEE");
        stk.push("SHOE");
        stk.push("Gujuju");
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
    }
}