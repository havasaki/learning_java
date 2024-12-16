package lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class task4 {

    // Метод для сохранения содержимого каталога в список
    public static List<String> listDirectoryContents(String path) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(path);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    fileList.add(file.getName());
                }
            }
        } else {
            System.out.println("Указанный путь не является каталогом.");
        }
        return fileList;
    }

    // Метод для вывода первых 5 элементов списка
    public static void printFirstFive(List<String> list) {
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }

    // Пример использования
    public static void main(String[] args) {
        String path = "C:\\Users\\havasaki\\IdeaProjects\\learningjava\\src\\lab21"; // Укажите путь к вашему каталогу
        List<String> files = listDirectoryContents(path);
        System.out.println("Содержимое каталога:");
        printFirstFive(files);
    }
}
