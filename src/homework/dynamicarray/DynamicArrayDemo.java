package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        array.add(2);
        array.add(4);
        array.add(6);
        array.add(8);
        array.add(10);

        System.out.println("new elements");
        array.print();
        System.out.println(" 6 = " + array.GetByIndex(2));
        System.out.println(" 10 = " + array.GetByIndex(4));

        array.set(1, 77);
        array.print();
        array.add(2, 44);
        array.print();
        array.deleteByIndex(3);
        array.print();
        System.out.println(" 99 ? " + array.exists(99));
        System.out.println(" 44 ? " + array.exists(44));
        System.out.println(" 77 index = " + array.getIndexByValue(77) );
        System.out.println(" 555 index = " + array.getIndexByValue(555) );

    }

}
