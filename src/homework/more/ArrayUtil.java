package homework.more;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        //1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("  " + numbers[i]);
        }
        System.out.println("-----------------");
        //2
        System.out.println(numbers[0]);
        System.out.println("------------------");
        //3
        System.out.println(numbers[numbers.length - 1]);
        System.out.println("------------------");
        //4
        System.out.println(numbers.length);
        System.out.println("------------------");
        //5
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println("------------------");
        //6
        System.out.println(numbers[4]);
        System.out.println("------------------");
        //7
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("------------------");
        //8
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("------------------");
        //9
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println("------------------");
        //10
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        average /= numbers.length;
        System.out.println(average);
        System.out.println("------------------");
    }
}
