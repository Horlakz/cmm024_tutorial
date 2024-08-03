public abstract class BasicShape {
    private String color;
    private int size;
    private int noOfSides;

    public BasicShape(String color, int size, int noOfSides) {
        this.color = color;
        this.size = size;
        this.noOfSides = noOfSides;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getNoOfSides() {
        return noOfSides;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNoOfSides(int noOfSides) {
        this.noOfSides = noOfSides;
    }

    public abstract int getArea();
}
