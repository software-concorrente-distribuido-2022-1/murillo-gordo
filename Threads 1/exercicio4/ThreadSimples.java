public class ThreadSimples 
{
    //método que obtém uma mensagem como parâmetro e concatena o nome da thread atual à mensagem
    static void mensagem(String messagem) 
    {
        //obtem o nome da thread rodando atualmente
        String nomeThread = Thread.currentThread().getName();
        //concatena e printa o nome da thread com a mensagem informada
        System.out.println(nomeThread + " " + messagem);
    }

    //loop que vai printar uma serie de strings com o nome da thread atual
    private static class Loop implements Runnable 
    {
        //define o que vai rodar na thread
        public void run() 
        {
            //contém as strings a serem printadas
            String info[] = 
            {
                    "Java",
                    "é uma boa linguagem.",
                    "Com threads,",
                    "é melhor ainda."
            };
            //try catch que vai verificar se a thread foi interrompida
            try 
            {
                //loop para printar todo o conteudo do array de strings
                for (int i = 0; i < info.length; i++) 
                {
                    //pausa a thread por 4000 milissegundos
                    Thread.sleep(4000);
                    //printa o nome da thread e uma linha do array de strings
                    mensagem(info[i]);
                }
            //entra nessa linha de código se a thread for interrompida
            } catch (InterruptedException e) 
            {
                //mensagem informando a interrupção da thread
                mensagem("Nada feito!");
            }
        }
    }

    public static void main(String args[]) throws InterruptedException 
    {
        long paciencia = 1000 * 60 * 60;
        if (args.length > 0) 
        {
            try 
            {
                paciencia = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) 
            {
                System.err.println("Argumento deve ser um inteiro.");
                System.exit(1);
            }
        }
        mensagem("Iniciando a thread Loop");
        long inicio = System.currentTimeMillis();
        Thread t = new Thread(new Loop());
        t.start();
        mensagem("Esperando que a thread Loop termine");
        while (t.isAlive()) 
        {
            mensagem("Ainda esperando...");
            t.join(1000);
            if (((System.currentTimeMillis() - inicio) > paciencia) && t.isAlive()) 
            {
                mensagem("Cansado de esperar!");
                t.interrupt();
                t.join();
            }
        }
        mensagem("Finalmente!");
    }
}