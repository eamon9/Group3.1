package AccentureBootcamp.Day3Tasks.Task3_5;

public class SportCar extends Car{
    private String model;
    private String mark;
    private int year;
    SportCar(String model, String mark, int year) {
        this.mark = mark;
        this.model= model;
        this.year= year;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model= model;
    }

    public void setYear(int year) {
        this.year= year;
    }


}
