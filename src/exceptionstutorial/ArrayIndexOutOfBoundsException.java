package exceptionstutorial;

/**
 *
 * @author Alyson
 */
public class ArrayIndexOutOfBoundsException extends Exception{

    private final static String MSG = "Index out of bounds.";
    public ArrayIndexOutOfBoundsException() {
        super(MSG);
    }

    public ArrayIndexOutOfBoundsException(String string) {
        super(MSG);
    }

    public ArrayIndexOutOfBoundsException(String string, Throwable thrwbl) {
        super(MSG, thrwbl);
    }

    public ArrayIndexOutOfBoundsException(Throwable thrwbl) {
        super(MSG, thrwbl);
    }
    
}
