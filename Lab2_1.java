import java.util.Scanner;

public class Lab2_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println("the first number is equal to the second number");
        }

        if (number1 != number2) {
            System.out.println("The first number is not equal to the second number");
        }

        if (number1 > number2) {
            System.out.println("The first number is greater than the second number");
        }

        if (number1 < number2) {
            System.out.println("The first number is lesser than the second number");
        }

        if (number1 >= number2) {
            System.out.println("The first number is greater than or equal to the second number");
        }

        if (number1 <= number2) {
            System.out.println("The first number is lesser than or equal to the second number");
        }

        input.close();
    }
}   
