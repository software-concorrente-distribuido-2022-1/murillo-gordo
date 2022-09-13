package ex1;

public class TesteContador 
{
    public static void main(String args[]) throws InterruptedException 
    {
        // //Caso Contador seja Thread
        //Contador contador = new Contador();
        //contador.start

        // //Caso Contador seja Runnable
        // Contador contador = new Contador();
        // Thread thread = new Thread(contador);
        // thread.start();

        //Múltiplas threads
        Contador contador = new Contador();
        Thread thread1 = new Thread(contador);
        Thread thread2 = new Thread(contador);
        Thread thread3 = new Thread(contador);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}