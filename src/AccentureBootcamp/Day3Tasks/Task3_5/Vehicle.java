package AccentureBootcamp.Day3Tasks.Task3_5;


// steering, changing gears, and drive (having speed in other words).
public class Vehicle {

    void go(String gear) {
        switch (gear) {
            case "N" -> System.out.println("The vehicle starts moving slowly");
            case "1" -> System.out.println("The vehicle is moving forward");
            case "2" -> System.out.println("The vehicle is moving forward");
            case "3" -> System.out.println("The vehicle is moving forward");
            case "4" -> System.out.println("The vehicle is moving forward");
            case "5" -> System.out.println("The vehicle is moving fast forward");
        }

    }

    void stop() {
        System.out.println("The vehicle is stoped");
    }

    void backwards() {
        System.out.println("The vehicle is moving backwards");
    }

    void steeringWheel(int steering) {
        if(steering> 0) {
            System.out.println("You stear the wheel right");
        } else{
            System.out.println("You stear the wheel left");
        }
    }
}
