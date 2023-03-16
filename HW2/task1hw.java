package HW2;

import java.util.Scanner;

public class task1hw {
// 1. Создать метод, который проверяет, является ли строка палиндромом.
    public static void main(String[] args) {
        String str = inputString("Введите строку для проверки: ");
        System.out.println(isPilindrom(str) ? "Введенная строка является палиндромом" : "Введенная строка не является палиндромом");
    }
    /**
     * Принмиает на вход строку read с запросом, считывает с косоли введенную строку и возвращает ее
     */
    public static String inputString(String read) {
        Scanner sc = new Scanner(System.in);
        System.out.print(read);
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    /**
     * Принимает на вход строку pld, проверяет является ли она палиндромоми и в зависимости от результата возвращает true или false
     */
    public static boolean isPilindrom(String pld) {
        StringBuilder str = new StringBuilder(pld);
        return pld.equals(str.reverse().toString());
    }
}