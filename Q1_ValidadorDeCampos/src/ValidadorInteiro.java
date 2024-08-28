public class ValidadorInteiro implements IValidador {
    public ValidadorInteiro() {}
    public boolean valida(String valor) {
        for(int i=0;i<valor.length();i++){
            if (!Character.isDigit(valor.charAt(i))){
                return false;
            }
        }
        return true;
    }
}