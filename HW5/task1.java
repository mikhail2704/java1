package HW5;
import java.util.*;

//        Реализовать консольное приложение, которое:
//
//        Принимает от пользователя строку вида text~num
//
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//
//        Если введено print~num, выводит строку из позиции num в связном списке.
//
//        Если введено exit, завершаем программу
//
//        Пример:
//        string~4
//        num~3
//        print~3
//
//        num
//        print~4
//        string
//        my_value~1
//        print~1
//        my_value
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Object> list = new LinkedList<>();
        list.add("Empty");
        boolean isExit = false;
        while (!isExit) {
            String s = sc.nextLine();
            if (s.equals("exit")) {
                isExit = true;
            }
           else if (getValue(s).equals("print")){
                int num = getIndex(s);
                System.out.println(list.get(num));
            }
            else {
                createArrays(list, s);
            }
        }
    }

        public static void createArrays (LinkedList<Object> list, String s) {
        int num = getIndex(s);
        String string = getValue(s);
            for (int i = list.size(); i <= num; i++) {
                if (list.size() - 1 < num){
                    list.add("Empty");
                    }
                }
            list.set(num, string);
        }

        public  static String getValue (String s){
        String[] temp = s.split("~");
         return temp[0];
        }

        public static Integer getIndex(String s) {
         String[] temp = s.split("~");
         int num = 0;
         if (isNumber(temp[1])) {
             num = Integer.parseInt(temp[1]);
         }
         return num;
         }
        public static boolean isNumber (String str){
            try {
                Integer.parseInt(str);
            } catch (Exception e) {
                return false;
            }
            return true;
        }
    }
    public static void parasit() {
        int num0 = 5;
        if (num0) {
            
        }    
    }
    /// Linux 1. Управление пользователями:
a) создать нового пользователя;
b) убедиться, что информация о нем появилась в соответствующих файлах в системе;
c) удалить созданного пользователя;

2. Управление группами:
a) создать группу;
b) попрактиковаться в смене групп у пользователей;
c) добавить пользователя в группу, не меняя основной;
d) удалить пользователя из группы.

3. Работа с группами.
a) Создать пользователя с правами суперпользователя. Проверить результат.

b) * Создать группу developer и нескольких пользователей, входящих в неё. Создать директорию для совместной работы. Сделать так, чтобы созданные одними пользователями файлы могли изменять другие пользователи этой группы.

c) * Создать в директории для совместной работы поддиректорию для обмена файлами, но чтобы удалять файлы могли только их создатели.///