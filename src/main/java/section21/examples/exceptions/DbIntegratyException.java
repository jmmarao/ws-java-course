package section21.examples.exceptions;

public class DbIntegratyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DbIntegratyException(String message) {
        super(message);
    }
}
