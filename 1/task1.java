import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] binar = new int[10];
        for (int i = 0; i < binar.length; i++) {
            binar[i] = rand.nextInt(0,2);
        }
        System.err.println(Arrays.toString(binar));
        System.out.println(print(binar)); // 3
        System.out.println((print(new int[]{1, 1, 1, 1, 1, 1}))); // 6
        System.out.println((print(new int[]{1, 1, 1, 1, 0, 0}))); // 4
    }

    // Дан массив двоичных чисел, вывести максимальное количество подряд идущих единиц.
    private static int print(int[] array) {
        int count = 0;
        int temp = 0;
        for (int i : array) {
            if (i == 1) temp++;
            else {
                if (temp > count) count = temp;
                temp = 0;
            }
        count = count > temp ? count : temp;
        }
        return count;
    }
}