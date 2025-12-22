package HW7.task2;

public class Square extends Figure{
    private final double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
