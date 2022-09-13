package exercicio3.src;

public class ThreadSimples 
{
    public static void main(String args[]) throws InterruptedException 
    {
        String info[] = 
        {
            "Thread atual: " + Thread.currentThread().getName(),
            "Java",
            "é uma boa linguagem.",
            "Com threads",
            "é melhor ainda."
        };
        for (int i = 0; i < info.length; i++) 
        {
            Thread.sleep(4000);
            System.out.println(info[i]);
        }
    }
}