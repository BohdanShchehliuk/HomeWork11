package Task1;

public class Main {
    public static void main(String[] arg) {

        Car bmw = new Car();
        Car ferarry = new Car(1999);
        Car mazda = new Car(2021, "red");
        System.out.println("BMW year is " + bmw.year + ". BMW colour is " + bmw.colour);
        System.out.println("Ferarry year is " + ferarry.year + ". Ferarr colour is " + ferarry.colour);
        System.out.println("Mazda year is " + mazda.year + ". Mazda  colour is " + mazda.colour);

    }
}
