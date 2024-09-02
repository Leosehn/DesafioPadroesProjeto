import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<IObservador> observadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new LinkedList<>();
    }

    public void cadastra(IObservador observador){
        observadores.add(observador);
    }

    public void atualiza(List<Integer> mensagem){
        for (IObservador observador : observadores) {
            observador.atualizacao(mensagem);
        }
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        this.atualiza(getValores());
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}