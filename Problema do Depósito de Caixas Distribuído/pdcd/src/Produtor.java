public class Produtor implements Runnable 
{
	private Deposito deposito;
	public int segundos;
	
	public Produtor(Deposito deposito,int segundos)
	{
		this.deposito = deposito;
		this.segundos = segundos;
	}
	
	public void run()
	{
		int i = 0;
		for(i=0;i<10;i++)
		{
			try 
            {
				deposito.colocar();
				Thread.sleep(1000 * segundos);
            } catch (InterruptedException e) {}
		}
	}
	
}
