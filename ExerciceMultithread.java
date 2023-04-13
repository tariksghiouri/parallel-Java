/**
 * Exercice
 */
public class ExerciceMultithread implements Runnable {

    static int taille=10;
    static int[] A=new int [taille];
    static int[] B=new int [taille];
    static int[] C=new int [taille];
    int indice;
    ExerciceMultithread(int i){
            this.indice=i;
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
        // for (int i = 0; i < C.length; i++) {
        //     System.out.println(C[i]);
        // }
    }
    


    public static void main(String[] args) {
        Thread[] mesThreads = new Thread[taille];
        ExerciceMultithread ex;

        for (int i = 0; i < C.length; i++) {
            ex = new ExerciceMultithread(i);
            mesThreads[i] = new Thread(ex);
            mesThreads[i].start();
        }
        
        for (Thread thread : mesThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < taille; i++) {
            System.out.println("C["+i+"]= "+C[i]);
        }

    }
}