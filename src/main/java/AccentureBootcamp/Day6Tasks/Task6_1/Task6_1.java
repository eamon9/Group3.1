package AccentureBootcamp.Day6Tasks.Task6_1;

import java.util.ArrayList;

//import org.apache.log4j.*;
public class Task6_1 {
    public Task6_1() {

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException a) {
            System.err.println("You can't divide by zero, moron! =P");
        }

        ArrayList<String> names= new ArrayList<>();
        names.add("Tom");
        names.add("Jessay");
        names.add("Marina");
        ArrayList<String> longNames= new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).length()> 5) {
                longNames.add(names.get(i));
                //System.out.println(names.get(i)+ "is longer than 5");
            }
        }

    }
}
