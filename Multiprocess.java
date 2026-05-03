public class Multiprocess extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);

        }
    }
    public static void main(String[] args){
        Multiprocess ob=new Multiprocess();
        Multiprocess ob2=new Multiprocess();
        Multiprocess ob3=new Multiprocess();
        ob.start();
        ob2.start();
        ob3.start();
    }
}