package AccentureBootcamp.Day6Tasks.Task6_1;

public class MyOwnException extends Exception{
    private int secretNr;
    public MyOwnException(String message, int secretNr) {
        super(message);
        this.secretNr= secretNr;
    }

    public int getSecretNr() {
        return secretNr;
    }
}
