import java.util.List;

public class VisualizadorDeMedia implements IObservador {
    private List<Integer> valores;
    private FonteDeDados fonteDeDados;
    private Boolean ligado;

    public VisualizadorDeMedia(List<Integer> valores){
        this.valores = valores;
        ligado = false;
    }
    //agora é private pra evitar de-sync com a fonte
    private void defineValores(List<Integer> valores){
        this.valores = valores;
    }
    //novo metodo
    public void cadastra(FonteDeDados fonte){
        fonteDeDados = fonte;
        fonteDeDados.cadastra(this);
        ligado = true;
    }
    //novo metodo
    public void atualizacao(List<Integer> mensagem){
        if (ligado) defineValores(mensagem);
    }
    //novo metodo
    public boolean liga() {
        if (fonteDeDados != null && !ligado){
            ligado = true;
            return true;
        }
        return false;
    }
    //novo metodo
    public boolean desliga() {
        if (fonteDeDados != null && ligado){
            ligado = false;
            return true;
        }
        return false;
    }
    //esse metodo nao deve ser usado, só o equivalente na FonteDeDados
    /*
    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }
    */
    public void exibeMedia(){
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }
}
