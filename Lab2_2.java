import java.util.Scanner;

public class Lab2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;

        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter result (1 - Pass, 2 = fail, Other value to Exit)");

            int userInput = input.nextInt();

            if (userInput == 1) {
                passes += 1; // passes = passes + 1
            }

            if (userInput == 2) {
                failures += 1; // failures = failures + 1
            }

            if (userInput != 1 && userInput != 2) {
                System.out.println("Data entry is done");
                isTrue = false;
            }
        }

        int entries = passes + failures;

        if (passes > (entries / 2)) {
            System.out.println("Bonus to instructor: half of the students passed");
        }
        
        System.out.printf("Number of passes: %d\n", passes);
        System.out.printf("Number of %s: %d\n", "failures", failures);

        input.close();
    }
}