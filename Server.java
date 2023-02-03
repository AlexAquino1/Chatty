import java.util.ArrayList;
public class Server implements Send{
    private ArrayList<Recieve> Persons = new ArrayList<>();
    public void Add(Recieve x){
        Persons.add(x);
    }
    public void Send(String From, String Message) {
        for(Recieve Chat : Persons) Chat.Recieve(From, Message);
    }
}
