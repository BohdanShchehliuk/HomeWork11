package Task3;


public class Main {
    public static void main(String[] arg) {
        Car1 mercedes = new Car1();
        Car1 audi = new Car1(1990);
        Car1 ford = new Car1(2000, 200.2);
        Car1 toyota = new Car1(1995, 220.5, 2000);
        Car1 bentley = new Car1(2020, 230, 1500, "white");
        System.out.println("mercedes: " + mercedes.year + " " + mercedes.colour + " " + mercedes.speed + " " + mercedes.weight);
        System.out.println("audi: " + audi.year + " " + audi.colour + " " + audi.speed + " " + audi.weight);
        System.out.println("ford: " + ford.year + " " + ford.colour + " " + ford.speed + " " + ford.weight);
        System.out.println("toyota: " + toyota.year + " " + toyota.colour + " " + toyota.speed + " " + toyota.weight);
        System.out.println("bentley: " + bentley.year + " " + bentley.colour + " " + bentley.speed + " " + bentley.weight);


    }
}
