public class Consumidor implements Runnable
{
		private Deposito deposito;
		public int segundos;
		
		public Consumidor(Deposito deposito,int segundos)
		{
			this.deposito = deposito;
			this.segundos = segundos;
		}
	public void run()
	{
		while(true)
		{
			try 
            {
				deposito.retirar();
				Thread.sleep(1000 * segundos);
            } catch (InterruptedException e) {}
		}
	}
}
