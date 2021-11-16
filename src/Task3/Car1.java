package Task3;

public class Car1 {
    public int year;
    public double speed;
    public int weight;
    public String colour;

    public Car1() {
        this.year = 1992;
        this.speed = 200.5;
        this.weight = 1990;
        this.colour = "red";
    }

    public Car1(int year) {
        this.year = year;
    }

    public Car1(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car1(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car1(int year, double speed, int weight, String colour) {
        this(year, speed, weight);
        this.colour = colour;
    }
}
