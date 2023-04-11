package popcorn02;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try (Socket client = new Socket("localhost",5000);
            OutputStream os = client.getOutputStreams();
            ObjectOutputStream oos = new ObjectOutputStream(os);) {

            oos.writeObject ("Hi, Simple Popcorn Network Server"); 
                oos.flush();
        } catch (Exeption e) {
        }
    }    
}