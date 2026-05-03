public class Division{
    public static void main(String[] args){
        try{
            new Division ().divide(10,0);
        }
        catch(Exception e){
            System.out.println("caught:"+e);
        }
    }
    public void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("cannot divide by zero");
        }
        else{
            System.out.println(a/b);
        }
    }
}