package HW8.task1;

public class Surgeon extends Doctor{

    @Override
    public void treat() {
        System.out.println("Хирург " + getName() + " лечит");
    }

    public Surgeon(String name, String specialization) {
        super(name, specialization);
    }
}
