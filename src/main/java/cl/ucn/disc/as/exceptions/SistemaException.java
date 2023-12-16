package cl.ucn.disc.as.exceptions;

import io.ebean.PersistenceIOException;

/**
 * The sistema exception
 *
 * @author arquitectura de software
 */
public class SistemaException extends RuntimeException {
    /**
     *
     * @param message the reason
     * @param ex the error
     */
    public SistemaException(String message, PersistenceIOException ex) {
        super(message,ex);
    }
}