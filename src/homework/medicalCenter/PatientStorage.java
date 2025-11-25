package homework.medicalCenter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PatientStorage implements Serializable {
    private List<Patient> patients = new ArrayList<>();

    public void add(Patient patient) {
        patients.add(patient);
    }

    public void printAllPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }

    }

    public void printByDoctor(String doctor) {
        for (Patient patient : patients) {
            if (patient.getDoctor().equals(doctor)) {
                System.out.println(patient);
            }
            System.out.println("not patient ");
        }
    }


}
