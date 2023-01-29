package io.github.starwarsapi.exception;

public class FilmNotFoundException extends Exception {

    public FilmNotFoundException(String msg){
        super(msg);
    }
}
