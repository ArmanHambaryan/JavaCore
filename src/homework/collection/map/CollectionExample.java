package homework.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {
    public static void main(String[] args) {


        Student studentPoxos = new Student("Poxos", "Poxosyan", "poxos@mail.com", 22);
        Student studentPetros = new Student("Petros", "Petrosyan", "petros@mail.com", 44);
        Student studentMartiros = new Student("Martiros", "Martirosyan", "martiros@mail.com", 33);

        Set<Student> studentList = new TreeSet<>(new StudnetNameComparator());
        studentList.add(studentPoxos);
        studentList.add(studentPetros);
        studentList.add(studentMartiros);
        System.out.println("Before sorting");
        for (Student student : studentList) {
            System.out.println(student);
        }
//        Collections.sort(studentList, new StudnetNameComparator());
//        studentList.sort(new StudnetNameComparator());
        System.out.println("After sorting ");
        for (Student student : studentList) {
            System.out.println(student);
        }


    }
}
