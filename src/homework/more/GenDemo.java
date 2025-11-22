package homework.more;

public class GenDemo {
    public static void main(String[] args) {


        GenExample<String> genstr = new GenExample<>("Xujan");
        String name = genstr.getOb();
        System.out.println(name);
        genstr.showType();


    }
}
