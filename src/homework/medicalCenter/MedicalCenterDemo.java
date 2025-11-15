package homework.medicalCenter;

import homework.medicalCenter.util.FileUtil;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PatientStorage patientStorage = FileUtil.deserializePatientStorage();
    private static DoctorStorage doctorStorage = FileUtil.deserializeDoctorStorage();

    public static void main(String[] args) {
        boolean found = true;
        while (found) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    found = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.println("please input doctor profession");
                    String profession = scanner.nextLine();
                    doctorStorage.searchDoctorByProfession(profession);
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.println("please input id ");
                    String id = scanner.nextLine();
                    doctorStorage.deleteDoctorById(id);
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    System.out.println("please input doctor id ");
                    String idd = scanner.nextLine();
                    doctorStorage.changeDoctorById(idd);
                    break;
                case ADD_PATIENT:
                    addpatient();
                    FileUtil.serializePatientData(patientStorage);
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    System.out.println("please input doctor ");
                    String doctor = scanner.nextLine();
                    patientStorage.printByDoctor(doctor);
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.printAllPatients();
                    break;
                default:
                    System.out.println("wrong command try again");


            }


        }


    }

    private static void addpatient() {
        doctorStorage.printAllDoctors();
        System.out.println("please choose doctor ");
        String doctor = scanner.nextLine();
        System.out.println("please input patient id");
        String id = scanner.nextLine();
        System.out.println("please input patient name ");
        String name = scanner.nextLine();
        System.out.println("please input patient surname");
        String surname = scanner.nextLine();
        System.out.println("please input patient phone ");
        String phone = scanner.nextLine();
        System.out.println("please input patient registerDateTime");
        String registerDateTime = scanner.nextLine();

        Patient patient = new Patient(id, name, surname, phone, doctor, registerDateTime, new Date());
        patientStorage.add(patient);
        System.out.println("Patient added successfully");

    }

    private static void addDoctor() {
        System.out.println("please input doctor id ");
        String id = scanner.nextLine();
        System.out.println("please input doctor name ");
        String name = scanner.nextLine();
        System.out.println("please input doctor surname");
        String surname = scanner.nextLine();
        System.out.println("please input doctor email ");
        String email = scanner.nextLine();
        System.out.println("please input doctor phoneNumber ");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input doctor profession ");
        String profession = scanner.nextLine();
        Doctor doctor = new Doctor(id, name, surname, email, phoneNumber, profession);
        doctorStorage.add(doctor);
        System.out.println("Doctor added successfully ");


    }


}
