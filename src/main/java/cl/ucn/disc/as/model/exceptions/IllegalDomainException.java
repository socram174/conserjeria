package cl.ucn.disc.as.model.exceptions;

public class IllegalDomainException extends RuntimeException {
    /**
     * The constructor
     *
     * @param message to use.
     * **/

    public IllegalDomainException(String message){
        super(message);
    }

}
