package lesson08.Homework_Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double areaCalculation() {
        return length * width;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * (length + width);
    }

}
