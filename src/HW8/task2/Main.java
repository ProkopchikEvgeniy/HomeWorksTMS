package HW8.task2;

import HW8.task1.Patient;
import HW8.task1.Therapist;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getColor());
        Apple.ChangeColor changeColor = apple.new ChangeColor();
        changeColor.changeColor("Yellow");
        System.out.println(apple.getColor());
    }
}

