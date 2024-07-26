import java.util.Scanner;

public class EasyCalc {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double x, y, z, result;

            System.out.println("Enter the first number: ");
            x = input.nextDouble();

            System.out.println("Enter the second number: ");
            y = input.nextDouble();

            System.out.println("Enter the third number: ");
            z = input.nextDouble();

            result = x * y * z;

            System.out.printf("Result is: %.3f\n", result);

            input.close();

    }
    
}
