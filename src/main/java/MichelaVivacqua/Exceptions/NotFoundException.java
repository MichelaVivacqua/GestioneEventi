package MichelaVivacqua.Exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(long id) {
        super("Il record con id " + id + " non è stato trovato!");
}}
