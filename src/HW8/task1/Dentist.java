package HW8.task1;

public class Dentist extends Doctor{
    @Override
    public void treat() {
        System.out.println("Дантист " + getName() + " лечит");
    }

    public Dentist(String name, String specialization) {
        super(name, specialization);
    }
}
