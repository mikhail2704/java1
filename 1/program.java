import java.util.Arrays;


public class program {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(); 

        System.out.println(isPositive(5)); // true
        System.out.println(); 

        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println(); 

        System.out.println(isLeapYear(2020)); //true
        System.out.println(isLeapYear(2021)); //false
        System.out.println(); 

        System.out.println(Arrays.toString(createArray(3, 42))); // [42, 42, 42]
        System.out.println(); 

        String[] stringArray = { "aaa", "aab", "aa" };
        System.out.println(findCommonPrefix(stringArray)); // "aa"
        String[] stringArray2 = { "abc", "bca", "cda" };
        System.out.println(findCommonPrefix(stringArray2)); // ""
        System.out.println();

        int[] binarArr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(binarArr)); // [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]
        binarMirror(binarArr);
        System.out.println(Arrays.toString(binarArr)); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]
        System.out.println(); 

        int[] randArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(randArr)); //  [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]
        multBy2IfLess6(randArr);
        System.out.println(Arrays.toString(randArr) + "\n"); // [2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]

        String sep = "---------------";
        int[][] squareArr = new int[5][5];  // [0, 0, 0, 0, 0]  [1, 0, 0, 0, 1]
        printSqureArray(squareArr);         // [0, 0, 0, 0, 0]  [0, 1, 0, 1, 0]
        System.out.println(sep);            // [0, 0, 0, 0, 0]  [0, 0, 1, 0, 0]
        fillDiagSqureArrayWith1(squareArr); // [0, 0, 0, 0, 0]  [0, 1, 0, 1, 0]
        printSqureArray(squareArr);         // [0, 0, 0, 0, 0]  [1, 0, 0, 0, 1]
        System.out.println(); 

        int[] array = {2, 13, 6, 4, 11, 1, 10, 4, 8, 8, 9};
        printMinMaxOfArray(array);
     }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (a + b >= 10 && a + b <= 20) return true;
        else return false;
    }

    /**
     * проверить, что х положительное
     */
    private static boolean isPositive(int x) {
        if (x >= 0) return true;
        else return false;
    }

    /**
     * напечатать строку source repeat раз
     */
    private static void printString(String source, int repeat) {
        String temp = "";
        for (int i = 0; i < repeat; i++) {
            temp += source;
        }   
        System.out.println(temp);
    }

    /**
     * проверить, является ли год високосным. если да - return true
     */
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) return true;
        else return false;
    }

    /**
     * должен вернуть массив длины len, каждое значение которого равно initialValue
     */
    private static int[] createArray(int len, int initalValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) arr[i] = initalValue;
        return arr;
    }

    /**
     * Найти общий префикс среди слов из одного массива.
     * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
     */
    private static String findCommonPrefix(String[] source) {
        
        String pref = "";
        int count = 0;
        while (count <= source[0].length()) {
            char item = source[0].toCharArray()[count];
            for (int i = 0; i < source.length; i++) {
                char[] temp = source[i].toCharArray();
                if (count > temp.length || item != temp[count]) return pref == "" ? "\"\"" : pref;
            }
            pref += item;
            count++;
        }
        return pref;
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.        
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
     * заменить 0 на 1, 1 на 0;
     */
    public static void binarMirror(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    arr[i] = 1;
                    break;
                case 1:
                    arr[i] = 0;
                    break;
            }
        }
    }
     
     /** 
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
     * циклом, и числа меньшие 6 умножить на 2;
     */
    public static void multBy2IfLess6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2; 
        }
    }

    /**  
     * Создать квадратный двумерный целочисленный массив (количество строк и
     * столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
     * только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы
     * таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void printSqureArray(int[][] arr) {
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }

    public static void fillDiagSqureArrayWith1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr[i].length - i - 1] = 1;
        }
    }

     /** 
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    public static void printMinMaxOfArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int item : arr) {
            if (item < min) min = item;
            else if (item > max) max = item; 
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }


}