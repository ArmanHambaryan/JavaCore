package homework.medicalCenter;


import java.io.Serializable;
import java.util.Scanner;

public class DoctorStorage implements Serializable {
    Scanner scanner = new Scanner(System.in);
    private Doctor[] doctors = new Doctor[10];
    private int size = 0;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();

        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[size + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;

    }

    public void searchDoctorByProfession(String profession) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equalsIgnoreCase(profession)) {
                System.out.println(doctors[i]);
                found = true;
            }

        }
        if (!found) {
            System.out.println("not doctors");
        }

    }

    public void deleteDoctorById(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                found = true;
                System.out.println(doctors[i] + " DELETED!!!!! ");
                for (int j = i; j < size - 1; j++) {
                    doctors[j] = doctors[j + 1];
                    size--;
                    doctors[size] = null;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Not this id doctor");

        }


    }

    public void printAllDoctors() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i].getName() + " ");

        }
    }

    public void changeDoctorById(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                found = true;
                System.out.println("please input new name doctor ");
                String name = scanner.nextLine();
                doctors[i].setName(name);
                System.out.println("please input new surname doctor ");
                String surname = scanner.nextLine();
                doctors[i].setSurname(surname);
                System.out.println("please input new email doctor ");
                String email = scanner.nextLine();
                doctors[i].setEmail(email);
                System.out.println("please input new phoneNumber doctor");
                String phoneNumber = scanner.nextLine();
                doctors[i].setPhoneNumber(phoneNumber);
                System.out.println("please input new profession doctor ");
                String profession = scanner.nextLine();
                doctors[i].setProfession(profession);
                System.out.println("hajoxutyamb poxvecin ");
                break;

            }
        }
        if (!found) {
            System.out.println("not this id doctor");
        }

    }


}
