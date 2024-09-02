import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DadoSerie implements IDado{
    private int lados;
    private int valorJogada;
    private final Random random;
    private List<Integer> serie;

    public DadoSerie(Dado dado) {
        this.lados = dado.getLados();
        this.random = new Random();
        this.serie = new ArrayList<Integer>();
    }

    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
        serie.add(valorJogada);
    }

    public int getValor() {
        return valorJogada;
    }

    public List<Integer> getSerie(){
        return serie;
    }
}
