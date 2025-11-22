package homework.collection.map;

import java.util.Comparator;

public class StudnetNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
