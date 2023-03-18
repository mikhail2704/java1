package HW3;
import java.util.ArrayList;
import java.util.Random;

public class task1hw {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа 
    // (в языке уже есть что-то готовое для этого)
    public static void main(String[] args) {
        ArrayList<Integer> randArr = getRandomArrList(20);
        System.out.println(randArr);
        delEvenFromArr(randArr);
        System.out.println(randArr);
    }

    public static ArrayList<Integer> getRandomArrList(int len) {
        Random rand = new Random();
        ArrayList<Integer> randArr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            randArr.add(rand.nextInt(100));
        }
        return randArr;
    }

    public static void delEvenFromArr(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
    }
}