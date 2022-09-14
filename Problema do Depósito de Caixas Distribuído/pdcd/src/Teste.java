public class Teste {
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
