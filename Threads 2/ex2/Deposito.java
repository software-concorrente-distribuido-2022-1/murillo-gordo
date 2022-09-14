public class Deposito
{
	public int itens = 0;
	public final int capacidade = 10;
	
	synchronized void retirar() throws InterruptedException
	{
		if(itens > 0)
		{
			itens--;
			System.out.println("Caixa retirada: Sobram " + itens + " caixas");
			notifyAll();
		}
		else
		{
			System.out.println("Não há caixas para retirar");
			wait();
		}
	}
	
	synchronized void colocar() throws InterruptedException
	{
		if (itens < capacidade)
		{
			itens++;
			System.out.println("Caixa armazenada: Passaram a ser " + itens + " caixas");
			notifyAll();
		}
		else
		{
			System.out.println("Não há espaço para mais caixas");
			wait();
		}
	}

	public static void main(String args[]) throws InterruptedException 
    {
		Deposito deposito = new Deposito();
		Produtor produtor = new Produtor(deposito,1);
		Consumidor consumidor = new Consumidor(deposito, 1);
		Thread consumerThread = new Thread(consumidor);
		Thread producerThread = new Thread(produtor);
		consumerThread.start();
		producerThread.start();
    }
}
