import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Servidor iniciado na porta 8080...");

        Deposito deposito = new Deposito();

        while (true) {
            Socket s = serverSocket.accept();
            System.out.println("Cliente " + s.getInetAddress().getHostAddress() + " conectado.");

            ThreadSockets thread = new ThreadSockets(s, deposito);
            thread.start();
        }
    }
}