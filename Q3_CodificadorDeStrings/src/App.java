public class App {
    public static void main(String[] args) throws Exception {
        CodificadorDesloca codDes = new CodificadorDesloca();
        CodificadorSimples codSimp = new CodificadorSimples();
        Codificador cod = new Codificador(codSimp);

        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.deCodifica(aux);
        System.out.println(aux);
        cod.defineCodificador(codDes);
        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.deCodifica(aux);
        System.out.println(aux);
    }
}
