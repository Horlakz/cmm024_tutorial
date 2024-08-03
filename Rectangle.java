public class Rectangle extends BasicShape {
    public Rectangle(String color, int size, int sides) {
        super(color, size, sides);
    }

    @Override
    public int getArea() {
        return this.getSize() * this.getNoOfSides();
    }
}
