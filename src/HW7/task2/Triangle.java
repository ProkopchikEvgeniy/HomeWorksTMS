package HW7.task2;

public class Triangle extends Figure{
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC) );
    }
}
