public class StaffTest {

    public static void main(String[] args) {
        Staff staff = new Staff("Horlakz", 20, "unilag", "2", "12");
        Person person = new Person("Dammie", "Scotland", 23);

        if (staff instanceof Staff) {
            System.out.println(staff.getStaffID());
        }

        System.out.println(staff.toString() + "\n" + person.toString());
    }
}