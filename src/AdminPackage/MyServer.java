package AdminPackage;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    ServerSocket server;

    public MyServer() {
        try {
            server = new ServerSocket(9000);
            while (true) {
                Socket socket = server.accept();
                new Thread(new ServerWork(socket)).start();

            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }
    public static void main(String[] args) {
        
   
        MyServer server = new MyServer();
    }

}
