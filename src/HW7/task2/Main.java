package HW7.task2;

public class Main {
    public static void main(String args[]){
        Figure circle = new Circle("Круг", 1);
        Figure rectangle = new Rectangle("Прямоугольник", 2,3);
        Figure square = new Square("Квадрат", 5);
        Figure triangle1= new Triangle("Треугольник1", 1,2,3);
        Figure triangle2 = new Triangle("Треугольник2", 3,3,3);

        Figure[] mass = new Figure[5];
        mass[0]=circle;
        mass[1]=rectangle;
        mass[2]=square;
        mass[3]=triangle1;
        mass[4]=triangle2;

        double sum=0;
        for(Figure f: mass){
            sum+=f.getPerimeter();
        }
        System.out.println(sum);
    }
}
