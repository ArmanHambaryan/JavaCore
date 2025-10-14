package lesson8;

public class Box {

    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;

    }

    double volume() {
        return width * depth * height;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight() {
    }


//    static class DemoBoxWeight {
//        public static void main(String[] args) {
//
//            BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
//            BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
//            double vol;
//
//            vol = mybox1.volume();
//            System.out.println("mybox1 vol = " + vol);
//            System.out.println();
//            System.out.println("mybox1 qashy = " + mybox1.weight);
//            System.out.println();
//            vol = mybox2.volume();
//            System.out.println("mybox2 vol = " + vol);
//            System.out.println();
//            System.out.println("mybox2 qashy = " + mybox2.weight);
//
//        }

}






