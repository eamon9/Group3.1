package AccentureBootcamp;

import AccentureBootcamp.Day7Tasks.InsertApp;
import AccentureBootcamp.Day7Tasks.SelectApp;

import java.io.IOException;
import java.util.logging.Logger;

public class Main {
    static final Logger logger= Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws IOException {
        //ConsoleAppender consoleAppender= new ConsoleAppender();
        //consoleAppender.setThreshold(Level.ALL);
        //logger.info("Log some information.");
        //new Task4_4();
        //new Task4_6();
        //new Task6_1();

        SelectApp selectApp = new SelectApp();
        //selectApp.selectAll();
        //selectApp.getCapacityGreaterThan(21.85);
        //selectApp.getAllFromDestination("media_types");
        //selectApp.getAllFromDestination("genres");

        InsertApp insertApp= new InsertApp();
        /*insertApp.insert("MP3");
        insertApp.insert("AMR");
        insertApp.insert("AVI");*/


    }
}
