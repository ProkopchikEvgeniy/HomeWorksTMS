package HW7.task1;

public abstract class Emoloyee {
    public String name;
    public String surname;
    public String jobTitle;

    public Emoloyee(String jobTitle, String surname, String name) {
        this.jobTitle = jobTitle;
        this.surname = surname;
        this.name = name;
    }
}
