import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{
    public static LogSimples instancia;
    private List<String> mensagens;

    private LogSimples(){
        mensagens = new LinkedList<>();
    }

    public void log(String m){
        if (instancia == null) instancia();
        String logM = LocalDate.now().toString() + " : " + m;
        instancia.mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        if (instancia == null) instancia();
        return instancia.mensagens.iterator();
    }

    public static LogSimples instancia(){
        if (instancia == null) instancia = new LogSimples();
        return instancia;
    }
}
