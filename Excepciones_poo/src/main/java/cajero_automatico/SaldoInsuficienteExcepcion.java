package cajero_automatico;

public class SaldoInsuficienteExcepcion extends Exception{ // se hereda de exception
    public SaldoInsuficienteExcepcion() { // se crea el constructor de saldosuficiente
        super("No puedes retirar mas dinero del que tienes en la cuenta");// se crea el mensaje de error
    }

}
