/**
 * Exercice
 */
public class Exercice implements Runnable {

    static int taille=10;
    static int[] A=new int [taille];
    static int[] B=new int [taille];
    static int[] C=new int [taille];
    Exercice(){

    }
    public void initialize(){

        for (int i = 0; i < taille; i++) {
            A[i]=i+3;
            B[i]=i*2;
            
        }
    }
    @Override
    public void run() {
        // System.out.println("running.....");
        initialize();   
        for (int i = 0; i < taille; i++) {
            C[i]=A[i]+B[i];
        }
        // System.out.println(C[0]);
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }
    }
    


    public static void main(String[] args) {
        Exercice ex=new Exercice();
        Thread t1=new Thread(ex);
        t1.start();
        try {
            t1.join(); // wait for t1 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < taille; i++) {
            System.out.println(C[i]);
        }

    }
}