public class App {
    public static void main(String[] args) {
        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);
        d6.rolar();
        d20.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());
        DadoSerie d20Serie = new DadoSerie(d20);
        d20Serie.rolar();
        System.out.println("D20: " + d20Serie.getValor());
        System.out.println("D20 serie: " + d20Serie.getSerie());
        d20Serie.rolar();
        System.out.println("D20: " + d20Serie.getValor());
        System.out.println("D20 serie: " + d20Serie.getSerie());
    }
}
