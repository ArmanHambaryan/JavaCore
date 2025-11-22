package homework.more;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        for (Integer i : list) {
            System.out.println(i);
        }


    }
}
