package HW3;

import java.util.ArrayList;
import java.util.Random;

public class task2hw {
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
    public static void main(String[] args) {
        ArrayList<Integer> randArr = getRandomArrList(20);
        System.out.println(randArr);
        System.out.printf("min = %d\nmax = %d\never = %.2f", 
        getMinOfArr(randArr), getMaxOfArr(randArr), getEverValOfArr(randArr));
    }

    public static ArrayList<Integer> getRandomArrList(int len) {
        Random rand = new Random();
        ArrayList<Integer> randArr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            randArr.add(rand.nextInt(100));
        }
        return randArr;
    }

    public static Integer getMinOfArr(ArrayList<Integer> arr) {
        Integer min = arr.get(0);
        for (Integer item : arr) {
            if (item < min) min = item;
        }
        return min;
    }

    public static Integer getMaxOfArr(ArrayList<Integer> arr) {
        Integer max = arr.get(0);
        for (Integer item : arr) {
            if (item > max) max = item;
        }
        return max;
    }

    public static Double getEverValOfArr(ArrayList<Integer> arr) {
        Double sum = 0.0;
        for (Integer item : arr) sum += item;
        return (sum / arr.size());
    }
}