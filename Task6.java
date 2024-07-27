public class Task6 {

    private static String name = "Horlakz";
    
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.println("number of times to run the for loop: ");
        // int userTimes = input.nextInt();

        // int times = 0;
        // while (times < userTimes) {
        //     times++;
        //     System.out.printf("Count = %s \n", times);
        // }


        // for (int i = 0; i < userTimes ; i++) {
        //     System.out.printf("Count = %s \n", i + 1);
        // }

        
        int result = publicFunction();

        System.out.println(result);

        // input.close();
    }

    public static int publicFunction() {
        privateMethod("Dammie", "Exam");
        privateMethod("Afo", "Making money");
        System.out.println("My tutor name is " + name);

        return 1;
    }

    private static void privateMethod(String name, String reason) {
        System.out.printf("My name is %s and I'm learning cos of %s \n", name, reason);
    }
}
