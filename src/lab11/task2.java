package lab11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем текущую дату и время
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущие дата и время: " + currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

        // Ввод даты и времени от пользователя
        System.out.println("Введите дату и время в формате 'yyyy-MM-dd HH:mm':");
        String userInput = scanner.nextLine();


        LocalDateTime userDateTime;
        userDateTime = LocalDateTime.parse(userInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

            // Сравнение дат
            if (userDateTime.isBefore(currentDateTime)) {
                System.out.println("Введенная дата и время находятся в прошлом.");
            } else if (userDateTime.isAfter(currentDateTime)) {
                System.out.println("Введенная дата и время находятся в будущем.");
            } else {
                System.out.println("Введенная дата и время совпадают с текущими.");
            }
        scanner.close();
    }
}