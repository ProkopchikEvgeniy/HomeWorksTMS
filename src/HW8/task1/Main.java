package HW8.task1;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Миша",1);
        Patient patient2 = new Patient("Маруся",2);
        Patient patient3 = new Patient("Виталик",3);
        Therapist therapist = new Therapist("Мария", "Терапевт");
        therapist.setDoctor(patient1);
        therapist.setDoctor(patient2);
        therapist.setDoctor(patient3);
    }
}
