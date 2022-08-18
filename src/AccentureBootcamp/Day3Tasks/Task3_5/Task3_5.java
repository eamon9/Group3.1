package AccentureBootcamp.Day3Tasks.Task3_5;

/*
5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
*/

import java.util.Scanner;

public class Task3_5 {
    SportCar sportCar;
    public Task3_5() {
        /*SportCar sportCar1= new SportCar("Ford", "Mustang", 2018);
        sportCar1.go();
        System.out.println("Year: "+sportCar1.getYear());
        sportCar1.setYear(2022);
        System.out.println("New year: "+sportCar1.getYear());*/
        String model, mark, gear;
        int year, steering, breaks;

        Scanner input= new Scanner(System.in);
        System.out.println("What car mark do you want to try?");
        System.out.println("1.Ford\n2.VW\n3.Audi");
        mark= input.next();
        mark = switch (mark) {
            case "1" -> "Ford";
            case "2" -> "VW";
            case "3" -> "Audi";
            default -> mark;
        };
        if(mark.equals("Ford")) {
            System.out.println("What car model do you want to try?");
            System.out.println("1.Mustang\n2.Focus\n3.Wildtrak");
            model= input.next();
            if(Integer.parseInt(model)==1) {
                model= "Mustang";
            } else if(Integer.parseInt(model)==2) {
                model= "Focus";
            } else if(Integer.parseInt(model)==3) {
                model= "Wildtrack";
            }
            if(model.equals("Mustang")) {
                System.out.println("What car year do you want to try?");
                System.out.println("1.1987\n2.1900\n3.2022");
                year= input.nextInt();
                if(year== 1) {
                    year= 1987;
                    sportCar= new SportCar(mark, model, year);
                    System.out.println("You chose to drive "+sportCar.getMark()+", "+sportCar.getModel()+", "+sportCar.getYear());
                }
            }
        }

        System.out.println("Lets hop in!");
        System.out.println("Choose gear(R, N, 1, 2, 3, 4, 5): ");
        gear= input.next();
        if(gear.equals("R")) {
            sportCar.backwards();
        } else {
            sportCar.go(gear);
        }

        System.out.println("Stear wheel(-190 - 190): ");
        steering= input.nextInt();
        sportCar.steeringWheel(steering);

        System.out.println("Now try brakes: ");
        System.out.println("1. BRAKE, 2. Let's drive further");
        breaks= input.nextInt();
        if(breaks==1) {
            sportCar.stop();
        } else{
            System.out.println("You need to go back!");
        }

    }
}
