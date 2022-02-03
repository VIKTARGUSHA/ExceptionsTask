package Univercity;

public class UnivercityHasNoFacultetsException extends Exception{
    public UnivercityHasNoFacultetsException(String message, String facultetName){
        System.out.println(message + " " + facultetName);
    }
}
