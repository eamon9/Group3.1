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
    String[] carMarks= {"Ford", "Ford", "Audi", "Audi"};
    String[] carModels= {"Mustang", "Focus", "A6", "100"};
    int[] carYears= {1987, 1900, 2014, 2022, 0};

    public Task3_5() {
        /*SportCar sportCar1= new SportCar("Ford", "Mustang", 2018);
        sportCar1.go();
        System.out.println("Year: "+sportCar1.getYear());
        sportCar1.setYear(2022);
        System.out.println("New year: "+sportCar1.getYear());*/
        String mark, gear;
        int steering, breaks;

        Scanner input= new Scanner(System.in);
        System.out.println("What car mark do you want to try?");
        System.out.println("1."+carMarks[0]+"\n2."+carMarks[2]+"\n3.Or just write your mark...");
        mark= input.next();

        mark = switch (mark) {
            case "1" -> carMarks[0];
            case "2" -> carMarks[2];
            default -> mark;
        };
        carMark(mark);

        System.out.println("Lets hop in!");
        boolean c= true;
        while(c) {
            System.out.println("Choose gear(R, N, 1, 2, 3, 4, 5): ");
            gear = input.next();
            if (gear.equals("R")) {
                sportCar.backwards();
            } else {
                sportCar.go(gear);
            }

            System.out.println("Stear wheel(-190 - 190): ");
            steering = input.nextInt();
            sportCar.steeringWheel(steering);

            System.out.println("Now try brakes: ");
            System.out.println("1. BRAKE, 2. Change gear");
            breaks = input.nextInt();
            if (breaks == 1) {
                sportCar.stop(gear);
                c= false;
            } else {
                c=true;
            }
        }

    }

    void carMark(String mark){
        Scanner input= new Scanner(System.in);
        String model;
        int year;

        if(mark.equals(carMarks[0])) {
            carModel(mark, findWriteCarModel(mark));

        } else if(mark.equals(carMarks[2])) {
            carModel(mark, findWriteCarModel(mark));

        } else{
            System.out.println("Write your own car mark: ");
            mark= input.next();
            System.out.println("Write your own car model: ");
            model= input.next();
            System.out.println("Write your own year: ");
            year= input.nextInt();
            carYear(mark, model, year);
        }
    }

    void carModel(String mark, String model) {
        Scanner input= new Scanner(System.in);
        int year;
        if(model.equals(carModels[0]) || model.equals(carModels[1])) {
            System.out.println("What car year do you want to try?");
            System.out.println("1."+carYears[0]+"\n2."+carYears[1]+"\n3.Write your own year");
            year= carYears[(input.nextInt()-1)];
            if(year==carYears[2]) {
                System.out.println("Write your own year: ");
                year= input.nextInt();
            }
            carYear(mark, model, year);
        } else if(model.equals(carModels[2]) || model.equals(carModels[3])) {
            System.out.println("What car year do you want to try?");
            System.out.println("1."+carYears[2]+"\n2."+carYears[3]+"\n3.Write your own year");
            year= carYears[input.nextInt()+1];
            if(year==carYears[4]) {
                System.out.println("Write your own year: ");
                year= input.nextInt();
            }
            carYear(mark, model, year);
        } else{
            System.out.println("What car year do you want to try?");
            System.out.println("1.Write your own year");
            year= input.nextInt();
            carYear(mark, model, year);
        }

    }

    void carYear(String mark, String model, int year) {
        printCar(mark, model, year);
    }

    void printCar(String mark, String model, int year) {
        sportCar= new SportCar(mark, model, year);
        String print= "You chose to drive- "+sportCar.getMark()+", "+sportCar.getModel()+", "+sportCar.getYear();
        System.out.println(print);
    }

    String findWriteCarModel(String mark) {
        String firstCar= "", secondCar= "";
        if(mark.equals(carMarks[0])) {
            firstCar= carModels[0];
            secondCar= carModels[1];
        } else if(mark.equals(carMarks[2])) {
            firstCar= carModels[2];
            secondCar= carModels[3];
        } else{
            System.out.println("Something goes wrong..");
        }
        Scanner input= new Scanner(System.in);
        String model;
        System.out.println("What car model do you want to try?");
        System.out.println("1."+firstCar+"\n2."+secondCar+"\n3.Or just write your model...");
        model= input.next();

        model = switch (model) {
            case "1" -> firstCar;
            case "2" -> secondCar;
            default -> model;
        };
        return model;
    }
}
