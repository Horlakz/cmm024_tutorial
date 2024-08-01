public class Person {
    private String name;

    private String currentAddress;

    private int age;

    public Person(String name, String currentAddress, int age) {
        this.name = name;
        this.currentAddress = currentAddress;
        this.age = age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getCurrentAddress() {
        return this.currentAddress;
    }

    public int getAge() {
        return this.age;
    }

    // transformers
    public void decreaseAge() {
        this.age--;
    }

    public void increaseAge() {
        this.age++;
    }

    // to string method
    public String toString() {
        return "name: " + this.name +
                " current address: " + this.currentAddress +
                " age: " + this.age; // e.g name: Horlakz current address: unilag age: 12
    }
}