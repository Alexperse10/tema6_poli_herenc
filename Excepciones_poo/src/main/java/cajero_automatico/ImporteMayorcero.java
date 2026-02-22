package cajero_automatico;

public class ImporteMayorcero extends Exception{
    public ImporteMayorcero() {
        super("el importe debe ser mayor que cero");
    }
}
