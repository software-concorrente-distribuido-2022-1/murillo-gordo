public class Deposito {
    private int items=0;
    private final int capacidade=10;
    public int retirar() {
        if (items>0) {
            items--;
            System.out.println("Caixa retirada: Sobram "+items+" caixas");
            return 1; }
        return 0;
    }
    public int colocar () {
        if (items<capacidade) {
            items++;
            System.out.println("Caixa armazenada: Passaram a ser "+items+"
                    caixas");
            return 1; }
        return 0;
    }
    public static void main(String[] args) {
        Deposito dep = new Deposito();
        Produtor p = new Produtor(d, 2);
        Consumidor c = new Consumidor(d, 1);
//inicia o produtor
//...
//inicia o consumidor
//...
        System.out.println("Execução do main da classe Deposito terminada!");
    }
