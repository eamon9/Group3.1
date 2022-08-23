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

    void stop(String gear) {
        switch (gear) {
            case "N" -> System.out.println("The vehicle safely stoped");
            case "1" -> System.out.println("The vehicle safely stoped");
            case "2" -> System.out.println("The vehicle stopped, but next time be more careful");
            case "3" -> System.out.println("Be careful, this is not a video game");
            case "4" -> System.out.println("This could have ended very badly, braking distance more than 200m");
            case "5" -> System.out.println("Congratulations, you crashed! I hope you have good insurance..");
        }
    }

    void backwards() {
        System.out.println("The vehicle is moving backwards");
    }

    void steeringWheel(int steering) {
        if(steering> 0) {
            System.out.println("You stear the wheel right by "+steering+"°");
        } else if(steering < 0){
            System.out.println("You stear the wheel left by "+steering+"°");
        } else if(steering> 190 || steering< -190) {
            System.out.println("You can't steer more than 190°, it's dangerous");
        }
    }
}
