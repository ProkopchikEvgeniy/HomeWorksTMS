package HW7.task2;

public class Circle extends Figure{
    public static final double PI = 3.14;
    private double radius;

    public Circle(String name,double radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
