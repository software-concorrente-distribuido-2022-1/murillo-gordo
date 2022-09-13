package ex1;

public class Contador implements Runnable
{
    public void run() 
    {
        for (int i = 0; i <= 10; i++) 
        {
            try 
            {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}