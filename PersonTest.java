
public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("Horlakz", "Unilag", 12);

        System.out.println(person.toString());

        person.setName("Dammie");
        person.setCurrentAddress("Scotland");
        person.setAge(20);

        for (int i = 0; i < 10; i++) {
            person.increaseAge();
        }

        System.out.println(person.toString());
    }
}
