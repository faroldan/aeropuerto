package exceptions;

public class AerolineaException extends Throwable {
    public AerolineaException() {
        super("\nLos atributos no pueden ser nulos");
    }

    public AerolineaException(String msg) {
        super("\n"+msg);
    }

}
