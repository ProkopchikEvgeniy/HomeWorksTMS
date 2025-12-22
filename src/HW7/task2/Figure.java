package HW7.task2;

public abstract class Figure {
    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();
}
