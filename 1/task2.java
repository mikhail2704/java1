import java.util.Arrays;

public class task2 {
    /*
     * Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа равные заданному, нужно перенести их в конец массива
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 3, 3, 5, 2, 3};
        swap(nums, 3);
        System.out.println(Arrays.toString(nums)); // [2, 2, 3, 3]
    }

    private static void swap(int[] array, int val) {
        int count = 0;
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) count++;
            else temp[i - count] = array[i];
        }
        for (int i = 0; i < array.length - count; i++) {
            array[i] = temp[i];
        }
        for (int i = array.length - count; i < array.length; i++) {
            array[i] = val;
        }
    }
}