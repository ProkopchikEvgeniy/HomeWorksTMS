package HW8.task1;

public class Therapist extends Doctor{

    @Override
    public void treat() {
        System.out.println("Терапевт " + getName() + " лечит");
    }

    public Therapist(String name, String specialization) {
        super(name, specialization);
    }

    public void setDoctor(Patient patient){
        if(patient.getTreatmentPlan()==1){
            Surgeon surgeon = new Surgeon("Вася", "Хирург");
            patient.setDoctor(surgeon);
            patient.getDoctor().treat();
        } else if (patient.getTreatmentPlan()==2) {
            Dentist dentist = new Dentist("Света", "Дантист");
            patient.setDoctor(dentist);
            patient.getDoctor().treat();
        }
        else {
            patient.setDoctor(this);
            patient.getDoctor().treat();
        }
    }
}
