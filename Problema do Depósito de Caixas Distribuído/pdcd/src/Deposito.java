public class Deposito
{
	public int itens = 0;
	public final int capacidade = 10;
	boolean ocupado = false;
	
	synchronized String retirar() throws InterruptedException
	{
		if(itens > 0)
		{
			itens--;
			return "Caixa retirada: Sobram " + itens + " caixas";
		}
		else
		{
			return "Não há caixas para retirar";
		}
	}
	
	synchronized String colocar() throws InterruptedException
	{
		if (itens < capacidade)
		{
			itens++;
			return "Caixa armazenada: Passaram a ser " + itens + " caixas";
		}
		else
		{
			return "Não há espaço para mais caixas";
		}
	}
}
