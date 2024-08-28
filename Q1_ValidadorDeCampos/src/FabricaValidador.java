public class FabricaValidador {
    public static IValidador criaValidador(Tipo tipo){
        if (tipo.equals(Tipo.EMAIL)) {
            return new ValidadorEmail();
        }
        else if (tipo.equals(Tipo.INTEIRO)) {
            return new ValidadorInteiro();
        }
        else if (tipo.equals(Tipo.MATRICULA)) {
            return new ValidadorMatricula();
        }
        else {
            System.out.println("Validador inexistente");
        }
        return null;
    }
}
