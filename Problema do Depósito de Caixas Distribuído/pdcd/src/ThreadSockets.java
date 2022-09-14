import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadSockets extends Thread {
    private Socket socket;
    private Deposito deposito;

    public ThreadSockets(Socket s, Deposito il) {
        this.socket = s;
        this.deposito = il;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            String comando = entrada.readUTF();

            DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
            String resposta;

            synchronized (this) {

                if (comando.equals("retirar")) {
                    deposito.ocupado = true;
                    resposta = deposito.retirar();
                    saida.writeUTF(resposta);
                    deposito.ocupado = false;
                    notifyAll();
                }

                else if (comando.equals("colocar")) {
                    deposito.ocupado = true;
                    resposta = deposito.colocar();
                    saida.writeUTF(resposta);
                    deposito.ocupado = false;
                    notifyAll();
                }

                while (deposito.ocupado = true) {
                    try {
                        wait();
                    } catch (Exception e) {
                    }
                }
            }

            entrada.close();
            saida.close();

            socket.close();

        } catch (IOException ioe) {
            System.out.println("Erro: " + ioe.toString());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}