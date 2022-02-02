package Univercity;

public class CurrentGroupIsEmptyException extends Exception{
    public CurrentGroupIsEmptyException(String message, String speciality, String faculteName){
        System.out.println(message + " " + speciality + " " + faculteName);
    }
}
