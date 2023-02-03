import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Main {
    static Server server = new Server();
    public static void main(String args[]) {
        server.Add(new Chat("Alex", server));
        server.Add(new Chat("Jordan", server));
        server.Add(new Chat("Triston", server));
        server.Add(new Chat("Langston", server));
    }
}