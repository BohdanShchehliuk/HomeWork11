package Task2;

public class Car {
    public int year;
    public double speed;
    public int weight;
    public String colour;

    public Car() {
        this.year = 1992;
        this.speed = 200.5;
        this.weight = 1990;
        this.colour = "red";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 220.5;
        this.weight = 1999;
        this.colour = "white";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 2000;
        this.colour = "black";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = "green";
    }

    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
