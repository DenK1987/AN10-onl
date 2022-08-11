package lesson08.Homework_Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculation() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * Math.PI * radius;
    }

}
