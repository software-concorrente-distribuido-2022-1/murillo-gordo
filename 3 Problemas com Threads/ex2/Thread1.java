public class Thread1 implements Runnable
{
    String fruta;
    public Thread1(String fruta) {
        this.fruta = fruta;
    }

    public void run() 
    {
        while(true) 
        {
            try 
            {
                System.out.println(fruta);
                Thread.sleep(3000);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String args[]) throws InterruptedException 
    {
        Thread thread1 = new Thread(new Thread1("Maçã"));
        Thread thread2 = new Thread(new Thread1("Lichia"));
        Thread thread3 = new Thread(new Thread1("Melão"));
        Thread thread4 = new Thread(new Thread1("Laranja"));
        Thread thread5 = new Thread(new Thread1("Melancia"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}