package homework.more;

public class ArrayHomework {
    public static void main(String[] args) {
        //1
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 6;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.println(n);
            }
        }
        System.out.println("---------------");
        //2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - numbers[i]] + " ");
        }
        System.out.println("------------------");
        System.out.println("------------------");
        //3
        int[] numbers1 = {1, 2, 3, 4, 4, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < numbers1.length - 1; i++) {
            for (int j = 1 + i; j < numbers1.length; j++) {
                if (numbers1[i] == numbers1[j])
                    count++;
            }

        }
        System.out.println(count + "  ");


        System.out.println("------------------");
        //4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int vowelCount = 0;
        char[] vowel = {'ա', 'ե', 'է', 'ը', 'ի', 'օ'};
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (chars[i] == vowel[j])
                    vowelCount++;
            }

        }
        System.out.println(vowelCount);

    }
}
