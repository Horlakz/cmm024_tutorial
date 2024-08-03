public class Child extends Person {
    private Gender gender;

    public Child(String name, String currentAddress, int age, Gender setGender) {
        super(name, currentAddress, age);
        this.gender = setGender;
    }

    @Override
    public String toString() {
        return " name " + this.getName() +
                " age " + this.getAge() +
                " current address " + this.getCurrentAddress() +
                " gender " + this.gender;
    }
}
