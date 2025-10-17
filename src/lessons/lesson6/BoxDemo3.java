package lessons.lesson6;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.depth = 3;
        mybox2.width = 9;
        mybox2.height = 6;

        vol = mybox1.volume();
        System.out.println("Oбъeм равен " + vol);

        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);

    }
}
