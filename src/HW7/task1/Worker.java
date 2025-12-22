package HW7.task1;

public class Worker extends Emoloyee implements JobTitle{

    public Worker(String jobTitle, String surname, String name) {
        super(jobTitle, surname, name);
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title: " + jobTitle);
    }
}
