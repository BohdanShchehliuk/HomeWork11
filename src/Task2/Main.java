package Task2;

public class Main {
    public static void main(String[] arg) {
        Car mercedes = new Car();
        Car audi = new Car(1990);
        Car ford = new Car(2000, 200.2);
        Car toyota = new Car(1995, 220.5, 2000);
        Car bentley = new Car(2020, 230, 1500, "white");
        System.out.println("audi: " + audi.year + " " + audi.colour + " " + audi.speed + " " + audi.weight);
        System.out.println("ford: " + ford.year + " " + ford.colour + " " + ford.speed + " " + ford.weight);
        System.out.println("toyota: " + toyota.year + " " + toyota.colour + " " + toyota.speed + " " + toyota.weight);
        System.out.println("bentley: " + bentley.year + " " + bentley.colour + " " + bentley.speed + " " + bentley.weight);
        System.out.println("mercedes: " + mercedes.year + " " + mercedes.colour + " " + mercedes.speed + " " + mercedes.weight);

    }
}
