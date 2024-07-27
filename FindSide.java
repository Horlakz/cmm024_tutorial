
import java.util.Scanner;



public class FindSide {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the first side: ");
        double a = input.nextDouble();

        System.out.println("What's the second side: ");
        double b = input.nextDouble();

        System.out.println("What's the angle: ");
        double angle = input.nextDouble();


        double result = computeThirdSide(a, b, angle);

        System.out.printf("Our third side is %.2f", result);

        input.close();
    }

    private static double computeThirdSide(double a, double b, double angle) {
        double radians = angle * (Math.PI / 180);

        double c = Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(radians)));

        return c; 
    }
}
