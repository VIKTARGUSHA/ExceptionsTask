package Univercity;

public class NoItemsException extends Exception {

    NoItemsException(String studName, String message){
        System.out.println( message + " " + studName);
    }
}
