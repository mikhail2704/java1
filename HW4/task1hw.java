package HW4;
import java.util.ArrayList;
import java.util.Scanner;

public class task1hw {
    /**
    Реализовать консольное приложение, которое:
    Принимает от пользователя строку вида
    text~num
    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
    text~num (например, word~4)
    print~num (распечатать текст)
    
    word~1
    foo~5
    qwerty~10
    bar~5
    print~10 -> qwerty
    print~1 -> word
    print~2 -> пустая строка или исключение NoSuchElementException
    print~5 -> bar
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> textArr = new ArrayList<>();
        ItemArray itemArr = new task1hw().new ItemArray();
        do {
            itemArr = parseString(scan.nextLine(), "`");
            if (itemArr.index != -1) {
                if (itemArr.text.equals("print")){
                    boolean isOutOrEmpty = itemArr.index > textArr.size() || textArr.get(itemArr.index).isEmpty();
                    if (isOutOrEmpty) {
                        System.out.println("\"\"");
                    } else {
                        System.out.println(textArr.get(itemArr.index));
                        textArr.set(itemArr.index, "");
                    }
                } else appendArrLst(textArr, itemArr);
            }
        } while (!itemArr.text.equals("exit"));
        scan.close();
    }

    /**
     * Класс имеет два поля для хранения индекса и значения элемента списка/массива
     */
    public class ItemArray {
        String text;
        int index;
    }

    /**
     * Расделяет строку str по разделителю sep и возвращает результат в виде экземпляра класса ItemArr.
     * (Правильно сформулировал?)
     * Если значение индекса item.index не является натуральным числом или нулем, то в item.index записывается -1.
     */
    public static ItemArray parseString(String str, String sep) {
        String[] arr = str.split(sep);
        ItemArray item = new task1hw().new ItemArray();
        try {
            item.index = Integer.parseInt(arr[1]);
        } catch (Exception e){
        item.index = -1;
        }
        if (item.index < 0) item.index = -1;
        item.text = arr[0];
        return item;
    }

    /**
     * Добавляет в список arr значение item.text по индексу item.index. Если длины списка не достаточно, добавляет элементы 
     * заполненные пустыми строками.
     */
    public static void appendArrLst(ArrayList<String> arr, ItemArray item) {
        if (item.index >= arr.size()){
            for (int i = arr.size(); i <= item.index; i++) {
                arr.add("");
            }
        }
        arr.set(item.index, item.text);
    }
}