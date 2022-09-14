import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Produtor
{
	public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);

        DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
        saida.writeUTF("colocar");

        DataInputStream entrada = new DataInputStream(socket.getInputStream());

        String mensagem = entrada.readUTF();
        System.out.println(mensagem);

        entrada.close();
        saida.close();

        socket.close();
    }
}
