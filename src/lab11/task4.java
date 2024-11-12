package lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1; // Месяцы в Calendar начинаются с 0

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        // Ввод данных для времени
        System.out.print("Введите часы: ");
        int hour = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minute = scanner.nextInt();

        // Создание объекта Date
        Date date = new Date(year - 1900, month, day, hour, minute);

        // Создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);

        // Вывод объектов
        System.out.println("Дата (объект Date): " + date);
        System.out.println("Дата (объект Calendar): " + calendar.getTime());

        scanner.close();
    }
}