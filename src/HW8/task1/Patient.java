package HW8.task1;

public class Patient {
    private String name;
    private int treatmentPlan;
    private Doctor doctor;

    public Patient(String name, int treatmentPlan) {
        this.name=name;
        this.treatmentPlan = treatmentPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
