public class Class2 implements Runnable {
    Class2(){

    }
    @Override
    public void run() {
        System.out.println("running.....");;
    }
    
    public static void main(String[] args) {
        Class2 c2=new Class2();
        Thread t1=new Thread(c2);
        t1.start();
    }
}
