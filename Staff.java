public class Staff extends Person {
    private String staffID;
    private String NI;


    public Staff(String name, int age, String currentAddress, String staffID, String NI) {
        super(name, age, currentAddress);

        this.staffID = staffID;
        this.NI = NI;
    }

    public String toString() {
        return "name" + this.name +
             "age" + this.age +
             "current address" + this.currentAddress + 
             "staff id" + this.staffID + 
             "ni" + this.NI
    }

    public String getStaffID() {
        return this.staffID;
    }
}