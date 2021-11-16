package AdditionakTaskPDF;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        System.out.println("Enter radius:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println(MyArea.areaOfCircle(radius));
    }

}


