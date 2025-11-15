package homework.medicalCenter.util;

import homework.medicalCenter.DoctorStorage;
import homework.medicalCenter.PatientStorage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class FileUtil {

    private static final String PATIENT_DATA_FILE = "/Users/armanhambaryan/IdeaProjects/JavaCore/JavaCore/src/homework/medicalCenter/data/patientData.data";
    private static final String DOCTOR_DATA_FILE = "/Users/armanhambaryan/IdeaProjects/JavaCore/JavaCore/src/homework/medicalCenter/data/doctorData.data";

    public static void serializePatientData(PatientStorage patientStorage) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))) {
            objectOutputStream.writeObject(patientStorage);

        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Seralize patient data" + e);
        }


    }
    public static void serializeDoctorData(DoctorStorage doctorStorage) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))) {
            objectOutputStream.writeObject(doctorStorage);

        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Seralize patient data" + e);
        }


    }
    public static PatientStorage deserializePatientStorage(){

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof PatientStorage patientStorage )
                return patientStorage;
        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Seralize patient data" + e);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new PatientStorage();

    }
    public static DoctorStorage deserializeDoctorStorage(){

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof DoctorStorage doctorStorage )
                return doctorStorage;
        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Seralize patient data" + e);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new DoctorStorage();

    }

}
