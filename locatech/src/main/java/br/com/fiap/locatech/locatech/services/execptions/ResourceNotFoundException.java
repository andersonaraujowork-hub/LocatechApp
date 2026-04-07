package br.com.fiap.locatech.locatech.services.execptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String messge){
        super(messge);
    }

}
