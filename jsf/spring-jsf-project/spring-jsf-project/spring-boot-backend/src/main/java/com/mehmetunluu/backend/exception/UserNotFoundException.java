package com.mehmetunluu.backend.exception;

/**
 * Created by Neval Bayram on 18.06.2016.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String message){
        super(message);
    }

    public UserNotFoundException(Throwable cause){
        super(cause);
    }

    public UserNotFoundException(String message, Throwable cause){
        super(message,cause);
    }



}
