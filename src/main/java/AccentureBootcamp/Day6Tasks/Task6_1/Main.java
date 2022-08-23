package AccentureBootcamp.Day6Tasks.Task6_1;

public class Main {
    public static void main(String[] args) throws MyOwnException {

        try {
            connectToSecretNr("HI");
        }catch (MyOwnException e) {
            System.err.println("Error: "+e);
        }
    }

    public static void connectToSecretNr(String secretTxt) throws MyOwnException{
        if(!secretTxt.equals("....")) {
            throw  new MyOwnException("Access denied!!!", 9);
        }
    }
}
