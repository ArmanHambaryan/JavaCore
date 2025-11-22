package homework.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();
        Student studentPoxos = new Student("Poxos", "Poxosyan", "poxos@mail.com", 22);
        Student studentPetros = new Student("Petros", "Petrosyan", "petros@mail.com", 44);
        Student studentMartiros = new Student("Martiros", "Martirosyan", "martiros@mail.com", 33);

        studentMap.put("poxos@mail.com", studentPoxos);
        studentMap.put("petros@mail.com", studentPetros);
        studentMap.put("martiros@mail.com", studentMartiros);
        Student student = studentMap.get("poxos@mail.com");
        System.out.println(student);

    }
}
