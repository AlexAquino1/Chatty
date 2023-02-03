import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.*;
import java.awt.event.*;

public class Chat extends JFrame implements Recieve {
    JLabel label = new JLabel();
    JTextField textfield = new JTextField();
    JButton button = new JButton("Send");
    ArrayList<String> Lines = new ArrayList<String>(Arrays.asList("","",
            "", "", "", "", "", "", "", "", "","","","","","","","","","",""));
    String _name;
    Send _server;

    private String Conversation() {
        String s = "<html>";
        for (int i = 0; i < 20; i++)
            s = s + Lines.get(i) + "<br>";
        return s + Lines.get(20) + "</html>";
    }
    @Override
    public void Recieve(String From, String Message) {
        Lines.remove(0);
        Lines.add(From + ": " + Message);
        label.setText(Conversation());
    }
    public Chat(String name, Send server){
        super();
        _name = name;
        _server = server;
        setTitle(name);
        label.setText(Conversation());
        textfield.setBorder(BorderFactory.createLineBorder(Color.green));
        add(label);
        add(textfield);
        add(button);
        getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
                server.Send(name, textfield.getText());
                textfield.setText("");
            }
        });
    }
}