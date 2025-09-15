package homework;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        //1
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[1] + " ");
        System.out.print(numbers[2] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[4] + " ");
        System.out.print(numbers[5] + " ");
        System.out.print(numbers[6] + " ");
        System.out.print(numbers[7] + " ");
        System.out.println(numbers[8] + " ");
        System.out.println("-----------------");
        //2
        System.out.println(numbers[0]);
        System.out.println("------------------");
        //3
        System.out.println(numbers[8]);
        System.out.println("------------------");
        //4
        System.out.println(numbers.length);
        System.out.println("------------------");
        //5
        System.out.println(numbers[6]);
        System.out.println("------------------");
        //6
        System.out.println(numbers[4]);
        System.out.println("------------------");
        //7
        System.out.println("Զույգերի քանակը" + " = " + 3);
        System.out.println("------------------");
        //8
        System.out.println("Կենտերի քանակը" + " = " + 6);
        System.out.println("------------------");
        //9
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Մասիվի էլեմենտների գումարը = " + sum);
        System.out.println("------------------");
        //10
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        average /= numbers.length;
        System.out.println("միջին թվաբանականը = " + average );
        System.out.println("------------------");
    }
}
