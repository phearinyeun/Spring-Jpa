package dev.danvega.springBootJpa.response;

public class NotFoundException extends RuntimeException{
    private String message;
    private String result;

    public NotFoundException (Long id, String... message){
        super(message.length > 0 ? String.join("\n", message) : "Could not find id: " + id.toString());
    }
    public NotFoundException(String category1, String s, String category){

    }
}
