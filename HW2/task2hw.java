package HW2;

import java.nio.file.Files;
import java.nio.file.Path;

public class task2hw {
    // 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
    // Если уже файл создан, то перезаписываем его. 
    public static void main(String[] args) {
        String path = "HW2/file.txt";
        recreateFile(path);
        writeFile10x10(path, "TEST");
    }

    /**
     * Проверяет существует ли по пути path файл, если существует то удаляет его и создает новый
     */
    public static void recreateFile(String path) {
        Path file = Path.of(path);
        try {
            if (Files.exists(file)) Files.delete(file);
        Files.createFile(file);
        } catch (Exception e) {
            System.out.println("Ошибка при создании файла!");
        }
    }

    /**
     * Записывает в файл находящийся по адресу path 10 строк состоящих из строки str записанной 10 раз через пробел
     */
    public static void writeFile10x10(String path, String str) {
        String fileStr = new String();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fileStr += str + " ";
            }
            fileStr += "\n";
        }
        Path file = Path.of(path);
        try {
            Files.writeString(file, fileStr);
        } catch (Exception e) {
            System.out.println("Ошибка при записи в файл!");
        }
    }
}
