package Univercity;

public class NegativeAndAboveScoreException extends Exception {
    String score;
    String name;
    String message;
    public NegativeAndAboveScoreException(String name, String message, String score){

        this.message = message;
        this.score =score;
        this.name = name;
        System.out.println(message + " " + name + " " + score);
    }
}
