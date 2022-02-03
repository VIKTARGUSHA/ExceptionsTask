package Univercity;

public class ThisFacHasNoAnyGroupsException extends Exception{
    public  ThisFacHasNoAnyGroupsException(String message, String facultetName){
        System.out.println(message + " " + facultetName);
    }
}
