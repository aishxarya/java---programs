public class Multiprocess2 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            Thread t=Thread.currentThread();
            String str= t.getName();
            System.out.println(str+":"+i);

        }
    }
    public static void main(String[] args){
        Multiprocess2 ob=new Multiprocess2();
        Multiprocess2 ob2=new Multiprocess2();
        Multiprocess2 ob3=new Multiprocess2();
        ob.start();
        ob2.start();
        ob3.start();
    }
}