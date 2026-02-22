package cajero_automatico;

public class DepositoMaximoException extends Exception{
    public DepositoMaximoException() {
        super("No puedes ingresar mas de 3000€");
    }

}
