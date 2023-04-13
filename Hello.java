/**
 * Hello
 */
public class Hello extends Thread {
    public void run() {
        // System.out.println("traitement ... ");
        int nbDeCoeurs = Runtime.getRuntime().availableProcessors();
        System.out.println(nbDeCoeurs + " coeurs détéctés");
    }


    public static void main(String[] args) {
        // System.out.println("Hello World");
        Hello hello=new Hello();
        hello.run();    
    }
}