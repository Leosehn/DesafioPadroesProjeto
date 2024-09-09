import java.util.ArrayList;

public class Kit implements IProduto{
    private ArrayList<Produto> produtos;
    private double preco;
    private String nome;
    private int id;

    public Kit(String nome, int id) {
        produtos = new ArrayList<>();
        preco = 0.0;
        this.nome = nome;
        this.id = id;
    }

    public void add(Produto produto) {
        produtos.add(produto);
        preco += produto.getPreco();
    }

    public double getPreco() {
        return preco;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
}
