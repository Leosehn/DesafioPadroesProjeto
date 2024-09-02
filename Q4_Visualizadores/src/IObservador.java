import java.util.List;

public interface IObservador {
    public void cadastra(FonteDeDados fonte);
    public void atualizacao(List<Integer> mensagem);
    public boolean liga();
    public boolean desliga();
}
