public class Staff extends Person {
    private final String staffID;
    private final String NI;

    public Staff(String name, int age, String currentAddress, String staffID, String NI) {
        super(name, currentAddress, age);

        this.staffID = staffID;
        this.NI = NI;
    }

    @Override
    public String toString() {
        return " name " + this.getName() +
                " age " + this.getAge() +
                " current address " + this.getCurrentAddress() +
                " staff id " + this.staffID +
                " ni " + this.NI;
    }

    public String getStaffID() {
        return this.staffID;
    }
}