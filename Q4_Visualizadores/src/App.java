import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        var cs = new VisualizadorDeSomatorio(dados.getValores());
        cm.cadastra(dados);
        cs.cadastra(dados);
        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim, -1=desliga media, -2=desliga soma):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }
            if (valor == -1) {
                cm.desliga();
                continue;
            }
            if (valor == -2) {
                cs.desliga();
                continue;
            }
            dados.add(valor);
            cs.exibeSomatorio();
            cm.exibeMedia();
        }
        s.close();
        System.out.println("Fim");
    }
}
