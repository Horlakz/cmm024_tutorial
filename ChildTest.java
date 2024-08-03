public class ChildTest {

    public static void main(String[] args) {
        Child child = new Child("Horlakz", "Unilag", 34, Gender.MALE);

        Gender femaleGender = Gender.FEMALE;

        System.out.println(child.toString());
        System.out.println(femaleGender);
    }
}