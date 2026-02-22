package cajero_automatico;

public class Cuentabancaria {
    private  double saldo;

    public Cuentabancaria() {
        this.saldo = 500;

    }
    public Cuentabancaria(Double saldo) {
        this.saldo = saldo;

    }

    public void ingresardinero(double cantidad) throws DepositoMaximoException {
        if (cantidad>3000){
            throw new DepositoMaximoException();
        }
        if (cantidad<=0){
            throw new IllegalArgumentException("la cantidad debe ser mayor que cero");
        }
        saldo = saldo+cantidad;
    }

    public void retirarsaldo(double cantidad) throws LimiteDiarioException, SaldoInsuficienteExcepcion { // si los metodos llevan throw
        // significa que tus excepciones son checked es decir que heredan de exception
        if (cantidad<=0) {
            throw new IllegalArgumentException();
        }
        if (cantidad>600) {
            throw new LimiteDiarioException();
        }
        if (cantidad>saldo){
            throw new SaldoInsuficienteExcepcion();
        }
        saldo = saldo - cantidad;
    }

    public void Consultarsaldo() {
        System.out.println("el saldo de tu cuenta es "+saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuentabancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
