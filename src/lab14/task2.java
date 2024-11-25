package lab14;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки от пользователя
        System.out.println("Введите строку для манипуляций:");
        String inputString = scanner.nextLine();

        // Ввод регулярного выражения от пользователя
        System.out.println("Введите регулярное выражение для разбивки строки:");
        String regex = scanner.nextLine();

        // Разбиваем строку по введённому регулярному выражению
        String[] elements = inputString.split(regex);

        // Выводим элементы, полученные после разбивки
        System.out.println("Полученные элементы:");
        for (String element : elements) {
            System.out.println(element.trim());
        }

        // Закрыть сканер
        scanner.close();
    }
}